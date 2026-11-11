
package com.example.testengine;

public class AppTest {

    public void shouldAnswerWithTrue() {
        assert true : "Test failed";
        System.out.println("Test passed!");
    }

    public static void main(String[] args) {
        AppTest test = new AppTest();
        test.shouldAnswerWithTrue();
    }
}
