package com.company;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MovieQuestion {

    private boolean correctAnswer;
    private String questionText = "";
    ValueCompare values;

    public MovieQuestion() {
        values = new ValueCompare("movies.csv", 7944);
        SetQuestionText();
        SetCorrectAnswer();
    }

    private void SetQuestionText(){
        questionText = ("Was the film '" + values.getItem1Name() + "' released after the film '" + values.getItem2Name() + "'?");
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
