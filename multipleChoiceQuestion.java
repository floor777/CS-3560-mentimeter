package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class multipleChoiceQuestion extends Question {
    private final String[] questionBank = {"Which of the listed names are dog breeds?", "Which of the listed names" +
            " are IDE names?", "Which of these names are League of Legends characters?"};
    // Stored the questions and responses in String arrays to be able to easily print them and to have a unique index
    // for each question and response

    private String[] responses = {"(0) Maltese\n(1) Tiger\n(2) Sacramento\n(3) Parakeet\n", "(0) Eclipse\n" +
            "(1) Intellij\n(2) VS Code\n(3) React\n", "(0) Darius\n(1) Nunu\n(2) Zed\n(3) Anivia\n" };



    // Returns the multiple choice question generated by the random index in Question
    public String generateQuestion(int index) {
        return questionBank[index];

    }

    // Returns the multiple choice response generated by the random index in Question
    public String generateResponses(int index) {
        return responses[index];
    }


}