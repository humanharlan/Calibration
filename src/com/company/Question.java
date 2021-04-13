package com.company;

import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.Random;

public class Question {

    private enum Type{
        MOVIE,
        POPULATION,
        SONG,
        SCHOOL,
        CELEBRITY
    }
    private Type[]types = Type.values();
    private Type type;
    private String questionText;
    private boolean answer;

    public Question(){
        type = GetRandomType();
        if (type == Type.MOVIE){
            MovieQuestion movieQuestion = new MovieQuestion();
            this.questionText = movieQuestion.GetQuestionText();
            this.answer = movieQuestion.GetCorrectAnswer();
        }
        if (type == Type.POPULATION){
            PopulationQuestion populationQuestion = new PopulationQuestion();
            this.questionText = populationQuestion.GetQuestionText();
            this.answer = populationQuestion.GetCorrectAnswer();
        }
        if (type == Type.SONG){
            SongQuestion songQuestion = new SongQuestion();
            this.questionText = songQuestion.GetQuestionText();
            this.answer = songQuestion.GetCorrectAnswer();
        }
        if (type == Type.SCHOOL){
            SchoolQuestion schoolQuestion = new SchoolQuestion();
            this.questionText = schoolQuestion.GetQuestionText();
            this.answer = schoolQuestion.GetCorrectAnswer();
        }
        if (type == Type.CELEBRITY){
            CelebrityQuestion celebrityQuestion = new CelebrityQuestion();
            this.questionText = celebrityQuestion.GetQuestionText();
            this.answer = celebrityQuestion.GetCorrectAnswer();
        }
    }

    private Type GetRandomType(){
        Random random = new Random();
        return types[random.nextInt(types.length)];
    }

    public String GetQuestionText(){
        return questionText;
    }

    public boolean GetAnswer(){
        return this.answer;
    }

}
