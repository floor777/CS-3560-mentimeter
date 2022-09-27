package com.company;

import java.util.Arrays;

public class SimulationDriver {

    public static void main(String[] args) {

        SimulationDriver SD = new SimulationDriver();
        SD.configureQuestionAndResponse();

    }

    public void configureQuestionAndResponse() {
        Question question = new Question();
        int questionAndResponseIndex = question.createIndex();
        int singleOrMultipleChoiceIndex = question.pickSingleOrMultipleChoice();
        String generatedQuestion = question.generateQuestion(singleOrMultipleChoiceIndex, questionAndResponseIndex);
        String generatedResponses = question.generateResponse(singleOrMultipleChoiceIndex, questionAndResponseIndex);

        Student student = new Student();
        int[] test = student.generateStudentAnswers();
        String[] testIDs = student.generateStudentIDs();

        VotingService vs = new VotingService();
        int[] vsTest = vs.getStudentAnswers(test);
        String[] vsIDs = vs.getStudentIDs(testIDs);
        System.out.println(generatedQuestion);
        System.out.println(generatedResponses);

        System.out.println("Note: For true and false questions, indices 0 and 1 are True while indices 2 and 3 are false");
        System.out.println("Student IDs: " + Arrays.toString(vsIDs));
        System.out.println("Student answers: " + Arrays.toString(test));
        System.out.println("iVote submission results: " + Arrays.toString(vsTest));


    }

}
