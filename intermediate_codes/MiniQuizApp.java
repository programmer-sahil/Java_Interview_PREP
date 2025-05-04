package intermediate_codes;

import java.util.Scanner;

public class MiniQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions and answers
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android app development?",
            "3. Who is the founder of Microsoft?",
            "4. What is 5 + 3?",
            "5. Which keyword is used to create a class in Java?"
        };

        String[] options = {
            "a) Delhi  b) Mumbai  c) Kolkata  d) Chennai",
            "a) Swift  b) Python  c) Java  d) C++",
            "a) Steve Jobs  b) Bill Gates  c) Elon Musk  d) Jeff Bezos",
            "a) 6  b) 7  c) 8  d) 9",
            "a) object  b) def  c) new  d) class"
        };

        char[] answers = {'a', 'c', 'b', 'c', 'd'};
        int score = 0;

        System.out.println("🧠 Welcome to the Java Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer: ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("🎉 Quiz finished! Your score: " + score + "/" + questions.length);
    }
}


// how to run this code?

// javac intermediate_codes/MiniQuizApp.java

// java intermediate_codes.MiniQuizApp
