/*
Represents a scorecard that keeps a tally of correct and incorrect answers at each confidence level.
Calculates and keeps track of a score.
 */

package com.company;

public class ScoreKeeper {

    private int score, fiftyTrue, fiftyFalse, sixtyTrue, sixtyFalse, seventyTrue, seventyFalse,
    eightyTrue, eightyFalse, ninetyTrue, ninetyFalse, ninetyNineTrue, ninetyNineFalse;

    public ScoreKeeper(){
        score = 0;
        fiftyTrue = 0;
        fiftyFalse= 0;
        sixtyTrue= 0;
        sixtyFalse= 0;
        seventyTrue= 0;
        seventyFalse= 0;
        eightyTrue= 0;
        eightyFalse= 0;
        ninetyTrue= 0;
        ninetyFalse= 0;
        ninetyNineTrue= 0;
        ninetyNineFalse= 0;
    }

    //Counts the number of correct and incorrect answers at each confidence level
    public void NewAnswer(Boolean correct, String credence){
        if (correct) {
            switch (credence) {
                case "5":
                    fiftyTrue++;
                    break;
                case "6":
                    sixtyTrue++;
                    score = score + 26;
                    break;
                case "7":
                    seventyTrue++;
                    score = score + 49;
                    break;
                case "8":
                    eightyTrue++;
                    score = score + 68;
                    break;
                case "9":
                    ninetyTrue++;
                    score = score + 85;
                    break;
                case "0":
                    ninetyNineTrue++;
                    score = score + 99;
                    break;
            }
        }
        else {
            switch (credence) {
                case "5":
                    fiftyFalse++;
                    break;
                case "6":
                    sixtyFalse++;
                    score = score - 32;
                    break;
                case "7":
                    seventyFalse++;
                    score = score - 74;
                    break;
                case "8":
                    eightyFalse++;
                    score = score - 132;
                    break;
                case "9":
                    ninetyFalse++;
                    score = score - 232;
                    break;
                case "0":
                    ninetyNineFalse++;
                    score = score - 564;
                    break;
            }
        }
    }

    //takes the number of correct and incorrect answers for a confidence level and returns a percentage
    private String GetPercentage (float correct, float incorrect){
        float total = correct + incorrect;
        if (total == 0) return "___";
        return String.format("%.2f", (correct/total * 100));
    }

    public void DisplayScore(){
        System.out.println("Your current score is " + score);
        System.out.println("\nYou were correct...");
        System.out.println(GetPercentage(this.fiftyTrue, this.fiftyFalse) + "% of the time that you reported a 50% credence.");
        System.out.println(GetPercentage(this.sixtyTrue, this.sixtyFalse) + "% of the time that you reported a 60% credence.");
        System.out.println(GetPercentage(this.seventyTrue, this.seventyFalse) + "% of the time that you reported a 70% credence.");
        System.out.println(GetPercentage(this.eightyTrue, this.eightyFalse) + "% of the time that you reported a 80% credence.");
        System.out.println(GetPercentage(this.ninetyTrue, this.ninetyFalse) + "% of the time that you reported a 90% credence.");
        System.out.println(GetPercentage(this.ninetyNineTrue, this.ninetyNineFalse) + "% of the time that you reported a 99% credence.");
    }

}
