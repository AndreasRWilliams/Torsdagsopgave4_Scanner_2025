import java.util.ArrayList;

public class Team {
    private String name;
    private int rank;
    private ArrayList<String> players;

    // Constructor
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Setter for rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Add player to the team
    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Hold: " + name + " Rang: " + rank + "\nPlayers:\n");
        for (String player : players) {
            result.append(player).append("\n");
        }
        return result.toString();
    }
}
