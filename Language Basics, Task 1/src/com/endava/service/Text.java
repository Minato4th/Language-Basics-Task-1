package com.endava.service;

/**
 * 3/27/2017
 */
public class Text {

    public final static void menuBase(){
        System.out.println("Please chose what to do :\n"
                + "1. Insert array \n"
                + "2. Sort array \n"
                + "3. Show array \n"
                + "4. Exit");
    }

    public final static void createArray(){
        System.out.println("Please insert two numbers for array \n");
    }

    public final static void sortedArray(){
        System.out.println("Sorted \n");
    }

    public final static void showArray(){
        System.out.println("Current Array \n");
    }

    public final static void buy(){
        System.out.println("Good buy! \n");
    }

    public final static void incorrect(){
        System.out.println("Incorrect command \n");
    }
}
