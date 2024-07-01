package Quiz1;

import java.util.Scanner;

public class QuizView {
    Scanner scanner = new Scanner(System.in);

    public void displayQuestion(String question) {
        System.out.println("문제: " + question);
    }

    public String getUserAnswer() {
        System.out.println("답변을 입력하세요: ");
        return scanner.nextLine();
    }

    public void displayResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다!");
        }
    }

}
