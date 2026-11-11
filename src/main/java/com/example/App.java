package com.example;

public class App {

    public static int calculateScore(String[] answers, String[] studentAnswers) {
        int score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (studentAnswers[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        return score;
    }

    public static String getResult(int score) {
        if (score >= 2) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

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

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Your Answer: " + studentAnswers[i]);
        }

        int score = calculateScore(answers, studentAnswers);

        System.out.println("Final Score: " + score + "/3");
        System.out.println("Result: " + getResult(score));
    }
}