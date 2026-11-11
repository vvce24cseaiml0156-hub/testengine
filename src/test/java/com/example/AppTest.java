package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalculateScore() {

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

        int score = App.calculateScore(answers, studentAnswers);

        assertEquals(3, score);
    }

    @Test
    public void testPassResult() {
        assertEquals("PASS", App.getResult(2));
    }

    @Test
    public void testFailResult() {
        assertEquals("FAIL", App.getResult(1));
    }
}