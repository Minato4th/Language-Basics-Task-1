package com.endava.service;

import com.endava.entities.DataUtils;
import com.endava.validator.Validator;

/**
 * 3/27/2017
 */
public class Menu {

    private final int ONE = 1;
    private final int TWO = 2;
    private final int THR = 3;
    private final int FOU = 4;
    private final int FIV = 5;

    private Validator validator;
    DataUtils dataUtils;
    private int choiceOne;
    private int choiceTwo;
    private int[][] array;


    public Menu(){
        this.validator = new Validator();
        this.dataUtils = new DataUtils();
    }

    public void menu(){
        for (int i = 0; i < 3; i++) {
            Text.menuBase();
            this.choiceOne = validator.isDigit();
            i = menuChoice(this.choiceOne, i);
        }
        Text.buy();
    }

    private int menuChoice(int choice, int i){
        if (choice == ONE){
            menuOne();
        } else if (choice == TWO){
            menuTwo();
        } else if (choice == THR){
            menuThr();
        } else if (choice > FOU){
            Text.incorrect();
        }

        if (choice == FOU){
            i = FIV;
        } else if (choice < FOU){
            i--;
        }

        return i;
    }

    private void menuOne(){
        Text.createArray();
        this.choiceOne = validator.isDigit();
        this.choiceTwo = validator.isDigit();
        this.array = dataUtils.createArray(choiceOne, choiceTwo);
        System.out.println(this.array.length);
        this.array = dataUtils.setArray(this.array);
    }

    private void menuTwo(){
        this.array = dataUtils.sortArray(this.array);
        Text.sortedArray();
    }

    private void menuThr(){
        Text.showArray();
        dataUtils.getArray(this.array);
    }

}
