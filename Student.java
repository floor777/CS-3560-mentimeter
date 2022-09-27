package com.company;

import java.util.concurrent.ThreadLocalRandom;
// Used this to generate random integers between a range
// Needed it to generate student answers and to pick either multiple
// choice or single choice questions

public class Student {
    private String[] studentIDs = new String[10]; // Decided to store studentIDs and studentAnswers in arrays
    private int[] studentAnswers = new int[10]; // Made it simple to differentiate different students because they would
                                                // be at their own individual index

    public int[] generateStudentAnswers() { // generates the random student answer from index 0 to index 3
        for(int i = 0; i < 10; i++) {
            studentAnswers[i] = ThreadLocalRandom.current().nextInt(0, 4);
        }
        return studentAnswers;
    }

    public String[] generateStudentIDs() { // Generates the random IDs for the students
        for(int i = 0; i < 10; i++) {
            studentIDs[i] = java.util.UUID.randomUUID().toString();
        }
        return studentIDs;
    }
}
