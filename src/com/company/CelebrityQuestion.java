package com.company;

public class CelebrityQuestion {
    private boolean correctAnswer;
    private String questionText = "";
    ValueCompare values;

    public CelebrityQuestion() {
        values = new ValueCompare("celebrities.csv", 110);
        SetQuestionText();
        SetCorrectAnswer();
    }

    private void SetQuestionText(){
        questionText = ("In 2019, did " + values.getItem1Name() + " get paid more than " + values.getItem2Name() + "?");
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
