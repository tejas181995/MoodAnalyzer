package com.bridgelabz.moodanalyzer;

public class MoodAnalyzeException extends Exception{

    enum ExceptionType{

        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalyzeException(String message) {
        super(message);
    }
}
