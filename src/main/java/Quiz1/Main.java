package Quiz1;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("이것은 질문입니다?","123");
        QuizView view = new QuizView();
        QuizController controller = new QuizController(quiz, view);

        controller.startQuiz();
    }
}
