package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ValueCompare {

    private class Item {
        private String name;
        private int value;

        private Item(String fileName, int numberOfRows){
            getRandom(fileName, numberOfRows);
        }

        private void getRandom(String fileName, int numberOfRows){
            String line = "";
            String splitBy = ",";
            int randomRow = ThreadLocalRandom.current().nextInt(1, (numberOfRows + 1));

            try {
                File file = new File(fileName);
                Scanner sc = new Scanner(file);

            for (int i = 0; i < randomRow; i++) {
                line = sc.nextLine(); //will it always start reading the file from the first line?
            }
            String[] parsedLine = line.split(splitBy);
            name = parsedLine[0];
            value = Integer.parseInt(parsedLine[1]);
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }

    }

    private Item item1;
    private Item item2;
    private boolean item1Higher;

    public ValueCompare(String fileName, int numberOfRows) {
        item1 = new Item(fileName, numberOfRows);
        item2 = new Item(fileName, numberOfRows);
        while (item1.value == item2.value) {
            item2 = new Item(fileName, numberOfRows);
        }
        SetCorrectAnswer();
    }

    private void SetCorrectAnswer(){
        if (item1.value > item2.value)
            this.item1Higher = true;
        else
            this.item1Higher = false;
    }

    public boolean getCorrectAnswer(){
        return item1Higher;
    }

    public String getItem1Name(){
        return item1.name;
    }
    public String getItem2Name(){
        return item2.name;
    }
}