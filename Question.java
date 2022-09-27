package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Question {
    public int createIndex() { // Generates a random index for the answer and responses that will be displayed
        return ThreadLocalRandom.current().nextInt(0, 3);
    }

    public int pickSingleOrMultipleChoice() { // Decides if it will be a single choice or multiple choice question 0/1
        return ThreadLocalRandom.current().nextInt(0, 2);

    };

    // If the questionTypeNumber is 0, it generates a single choice question. If it is 1, it generates a multiple choice
    // question
    public String generateQuestion(int questionTypeNumber, int index) {
        if(questionTypeNumber == 0) {
            singleChoiceQuestion SCQuestion = new singleChoiceQuestion();

            return SCQuestion.generateQuestion(index);

        }
        else if(questionTypeNumber == 1) {
            multipleChoiceQuestion MCQuestion = new multipleChoiceQuestion();
            return MCQuestion.generateQuestion(index);

        }
        return null;
    }

    // If the questionTypeNumber is 0, it generates a single choice responses result.
    // If it is 1, it generates a multiple choice responses result
    public String generateResponse(int questionTypeNumber, int index) {
        if(questionTypeNumber == 0) {
            singleChoiceQuestion SCQuestion = new singleChoiceQuestion();
            return SCQuestion.generateResponses(index);

        }

        else if(questionTypeNumber == 1) {
            multipleChoiceQuestion MCQuestion = new multipleChoiceQuestion();
            return MCQuestion.generateResponses(index);
        }
        return null;

    }
}
