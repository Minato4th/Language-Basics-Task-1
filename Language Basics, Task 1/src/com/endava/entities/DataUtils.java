package com.endava.entities;

/**
 * 3/27/2017
 */
public class DataUtils {

    public int[][] createArray(int first, int second){
        return new int[first][second];
    }

    public int[][] setArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*100);
            }
        }
        return array;
    }

    public void getArray(int[][] array){
        for (int[] first : array) {
            for (int second : first) {
                System.out.print(second + " ");
            }
            System.out.println();
        }
    }

    public int[][] sortArray(int[][] array){

        for (int[] first : array) {
            bubbleSort(first);
        }

        return array;
    }

    private int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j-1] > array[j]){
                    int buff = array[j];
                    array[j] = array[j-1];
                    array[j-1] = buff;
                }
            }
        }
        return array;
    }
}
