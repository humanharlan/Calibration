package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void PrintMenu(){
        System.out.println("");
        System.out.println("Choose an option...");
        System.out.println("1. New Question");
        System.out.println("2. See your results");
        System.out.println("3. Quit");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScoreKeeper score = new ScoreKeeper();
        String userInput = "";
        Boolean userGuess;
        Boolean isCorrect;

	    System.out.println("\n~~~Welcome to the Calibration Game.~~~");

	    do{
	        PrintMenu();
	        userInput = sc.nextLine();
	        if (userInput.equals("1")){
	            Question question = new Question();

	            System.out.println(question.GetQuestionText());
	            System.out.println("'Y' for yes OR 'N' for no");
	            userInput = sc.nextLine();
	            if (userInput.equals("Y") || userInput.equals("y")){
	                userGuess=true;
	                System.out.println("You selected Yes.");
                }
	            else{
	                userGuess=false; //TODO add error checking for other inputs
                    System.out.println("You selected No.");
                }
	            System.out.println("How confident are you in your answer? Choose the closest option.");
	            System.out.println("'5'=50% '6'=60% '7'=70% '8'=80% '9'=90% '0'=99% ");
	            userInput = sc.nextLine();
	            isCorrect = (userGuess == question.GetAnswer());
	            score.NewAnswer(isCorrect, userInput);
            }
	        if (userInput.equals("2")){
	            score.DisplayScore();
            }
        }while (!userInput.equals("3"));

    }
}
