package com.company;

public class VotingService {
    private final int[] VSAnswerArray = new int[4]; // Used to store the student answers to the voting service
    private final String[] VSStudentIDArray = new String[10]; // Used to store the student IDs to the voting service

    public String[] getStudentIDs(String[] IDArray) { // Transfers the student IDs to the voting service
        for(int i = 0; i < IDArray.length; i++) {
            VSStudentIDArray[i] = IDArray[i];
        }
        return VSStudentIDArray;
    }

    public int[] getStudentAnswers(int[] intArray) { // Transfers the student answers to the voting service
        for(int i = 0; i < intArray.length; i++) {
            VSAnswerArray[intArray[i]]++;
        }
        return VSAnswerArray;

    }




}
