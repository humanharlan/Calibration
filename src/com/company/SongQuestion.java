package com.company;

public class SongQuestion {
    private boolean correctAnswer;
    private String questionText = "";
    ValueCompare values;

    public SongQuestion() {
        values = new ValueCompare("songs.csv", 10039);
        SetQuestionText();
        SetCorrectAnswer();
    }

    private void SetQuestionText(){
        questionText = ("Was the song " + values.getItem1Name() + " on the Billboard Hot 100 for more weeks than the song " + values.getItem2Name() + "?");
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
