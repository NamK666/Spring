package Quiz1;

import org.springframework.stereotype.Component;

import java.util.Scanner;
public class QuizView {
    public void displayQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("답변: ");
        String userAnswer = scanner.nextLine();
        scanner.close();
        return userAnswer;
    }


    public void displayResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
        }
    }


}
