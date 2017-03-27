package com.endava.validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3/27/2017
 */
public class Validator {

    private BufferedReader reader;
    private String string;

    public Validator(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String isString(){

        for (int i = 0; i < 3; i++) {
            try {
                this.string = reader.readLine();
                i = 5;
            } catch (IOException e) {
                System.out.println("Something go wrong, try again");
            }
        }

        return string;
    }

    public int isDigit(){

        for (int j = 0; j < 3; j++) {
            boolean right = true;
            String numS = isString();
            for (int i = 0; i < numS.length(); i++) {
                if (!Character.isDigit(numS.charAt(i))){
                    System.out.println("Wrong number format, please try again");
                    right = false;
                    break;
                }
            }

            if (right) {
                j = 5;
                this.string = numS;
            }
        }

        return Integer.parseInt(this.string);
    }
}
