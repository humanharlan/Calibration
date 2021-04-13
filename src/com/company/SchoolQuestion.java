package com.company;

public class SchoolQuestion {
    private boolean correctAnswer;
    private String questionText = "";
    ValueCompare values;

    public SchoolQuestion() {
        values = new ValueCompare("2016schoolsRank.csv", 800);
        SetQuestionText();
        SetCorrectAnswer();
    }

    private void SetQuestionText(){
        questionText = ("In 2016, did the Times rank " + values.getItem2Name() + " higher than " + values.getItem1Name() + "?");
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
