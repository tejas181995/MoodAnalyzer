package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String message;


    public MoodAnalyzer(String message){

        this.message = message;

    }

    public String analyseMood() {

        try {

            if(message == null)
                throw new MoodAnalyzeException("NULL");
            if(message.equals(""))
                throw new MoodAnalyzeException("Empty");

            return message.contains("sad") ? "SAD" : "HAPPY";
        }
        catch (MoodAnalyzeException e){

            System.out.println(e.getMessage());
            return "Exception Caught !!";
        }


    }

}