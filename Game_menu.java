import java.util.ArrayList;

public class GameMenu {
    private ArrayList<String> actions;

    // Constructor
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Display menu method
    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
