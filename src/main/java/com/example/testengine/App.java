package com.example.testengine;


public class App {

    public static void main(String[] args) {

        String[] questions = {
            "1. What is Java?",
            "2. Which language is used for web development?",
            "3. What is Maven?"
        };

        String[] answers = {
            "Programming Language",
            "Java",
            "Build Tool"
        };

        String[] studentAnswers = {
            "Programming Language",
            "Java",
            "Build Tool"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            System.out.println("Your Answer: " + studentAnswers[i]);

            if (studentAnswers[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("Final Score: " + score + "/3");

        if (score >= 2) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

