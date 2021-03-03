package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String message;

    public MoodAnalyzer(String message){

        this.message = message;

    }

    public String analyseMood() {

        try {

            if (message.contains("sad")) {

                return "SAD";

            } else {

                return "HAPPY";

            }
        }
        catch (NullPointerException e){

            System.out.println("catch block executed");

        }

        return "Exception got Handeled";

    }



}