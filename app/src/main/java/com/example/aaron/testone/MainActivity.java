package com.example.aaron.testone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> stringArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public boolean isPalindrom(String passedWord){
        String backword = "";

        for(int i = passedWord.length(); i >= 0; i--){
            backword = backword + passedWord.charAt(i);
        }
        return passedWord.equals(backword);
    }

    public boolean isArmstronNumber(int i){
        String passedNumber = i + "";
        if(passedNumber.length() != 3){
            return false;
        } else {
            String firstNumber = passedNumber.charAt(0) + "";
            String secondNumber = passedNumber.charAt(1) + "";
            String thirdNumber = passedNumber.charAt(2) + "";
            double power = 3;
            double result = Math.pow(Double.parseDouble(firstNumber),power) + Math.pow(Double.parseDouble(secondNumber),power) + Math.pow(Double.parseDouble(thirdNumber),power);

            return passedNumber.equals(result + "");

        }
    }

    public String stackProblem(String pushString){
        if(stringArray.size() == 4){
            String returnString = "";
            for(int i = 4; i >=0; i++){
                returnString = returnString + stringArray.get(i);
                stringArray.remove(i);
            }
            return returnString;
        } else {
            stringArray.add(pushString);
            return "";
        }
    }
}
