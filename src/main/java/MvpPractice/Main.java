package MvpPractice;

public class Main {
    public static void main(String[] args) {
        User model = new User("John",25);
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.updateView();

        controller.setUserName("Alice");
        controller.setUserAge(30);
        controller.updateView();
    }
}
