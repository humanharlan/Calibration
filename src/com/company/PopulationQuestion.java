package com.company;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class PopulationQuestion{

    private boolean correctAnswer;
    private String questionText = "";
    ValueCompare values;

    public PopulationQuestion() {
        values = new ValueCompare("2013countryPop.csv", 214);
        SetQuestionText();
        SetCorrectAnswer();
    }

    private void SetQuestionText(){
        questionText = ("In 2013, was the population of " + values.getItem1Name() + " greater than the population of " + values.getItem2Name() + "?");
    }

    private void SetCorrectAnswer(){
        correctAnswer = values.getCorrectAnswer();
    }

    public String GetQuestionText(){
        return questionText;
    }

    public boolean GetCorrectAnswer(){
        return this.correctAnswer;
    }

}