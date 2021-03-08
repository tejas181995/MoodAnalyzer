package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    enum ExceptionType {

        NULL, EMPTY;

    }

    public String message;


    public MoodAnalyzer(String message) {

        this.message = message;

    }

    public String analyseMood() {

        try {

            if (message == null | message == "") {

                throw new MoodAnalyzeException("Invalid Mood...!");
            } else if (ExceptionType.EMPTY.equals(ExceptionType.valueOf(message))) {

                throw new MoodAnalyzeException(ExceptionType.EMPTY + " MOOD");

            } else if (ExceptionType.NULL.equals(ExceptionType.valueOf(message))) {

                throw new MoodAnalyzeException(ExceptionType.NULL + " MOOD");

            }

            return message.contains("sad") ? "SAD" : "HAPPY";
        } catch (MoodAnalyzeException e) {

            System.out.println(e.getMessage());
            return "Exception Caught !!";
        }


    }
}

