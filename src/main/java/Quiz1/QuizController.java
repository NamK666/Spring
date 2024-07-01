package Quiz1;

public class QuizController {
    private Quiz quiz;
    private QuizView view;

    public QuizController(Quiz quiz, QuizView view) {
        this.quiz = quiz;
        this.view = view;
    }

    public void startQuiz() {
        view.displayQuestion(quiz.getQuestion());

        String userAnswer = view.getUserAnswer();
        boolean isCorrect = checkAnswer(userAnswer);
        view.displayResult(isCorrect);
    }

    private boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(quiz.getAnswer());
    }
}
