/*
Represents a question, with a category, the text of the question, and a correct answer.
 */

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

        switch (type){
            case MOVIE:
                MovieQuestion movieQuestion = new MovieQuestion();
                this.questionText = movieQuestion.GetQuestionText();
                this.answer = movieQuestion.GetCorrectAnswer();
            case POPULATION:
                PopulationQuestion populationQuestion = new PopulationQuestion();
                this.questionText = populationQuestion.GetQuestionText();
                this.answer = populationQuestion.GetCorrectAnswer();
            case SONG:
                SongQuestion songQuestion = new SongQuestion();
                this.questionText = songQuestion.GetQuestionText();
                this.answer = songQuestion.GetCorrectAnswer();
            case SCHOOL:
                SchoolQuestion schoolQuestion = new SchoolQuestion();
                this.questionText = schoolQuestion.GetQuestionText();
                this.answer = schoolQuestion.GetCorrectAnswer();
            case CELEBRITY:
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
