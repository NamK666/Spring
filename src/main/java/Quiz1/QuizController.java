package Quiz1;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class QuizController {
    public Quiz quiz;
    public QuizView view;

    public void startQuiz() {
        view.displayQuestion(quiz.getQuestion());

        String userAnswer = quiz.getAnswer();

        boolean isCorrect = checkAnswer(userAnswer);

        view.displayResult(isCorrect);
    }


    private boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(quiz.getAnswer());
    }
}

