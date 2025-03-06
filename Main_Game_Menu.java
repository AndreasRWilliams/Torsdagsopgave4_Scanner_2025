import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of actions
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Create an instance of GameMenu and display the menu
        GameMenu gameMenu = new GameMenu(actions);
        gameMenu.displayMenu();
    }
}
