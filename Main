import java.util.ArrayList;

// 1.b - Team class
class Team {
    // 1.c 
    private String teamName;

    // 1.d 
    private int rank;

    // 1.e 
    private ArrayList<String> players;

    // 1.f 
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>(); 
    }

    // 1.h 
    public void setRank(int rank) {
        this.rank = rank;
    }

    // 1.l 
    public void addPlayer(String player) {
        this.players.add(player);
    }

    // 1.j & 1.m 
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Hold: " + this.teamName + " Rang: " + this.rank + "\nPlayers:\n");
        for (String player : players) {
            result.append(player).append("\n");
        }
        return result.toString();
    }
}

// 1.a 
public class Main {
    public static void main(String[] args) {
        // 1.g 
        Team team1 = new Team("De Uovervindelige");

        // 1.i 
        team1.setRank(3);

        // 1.k 
        team1.addPlayer("Player 1");
        team1.addPlayer("Player 2");
        team1.addPlayer("Player 3");


        System.out.println(team1.toString());

        // 1.k 
        Team team2 = new Team("The Challengers");
        team2.setRank(5);
        team2.addPlayer("Player A");
        team2.addPlayer("Player B");
        System.out.println(team2.toString());

        Team team3 = new Team("The Warriors");
        team3.setRank(1);
        team3.addPlayer("Player X");
        team3.addPlayer("Player Y");
        System.out.println(team3.toString());

        Team team4 = new Team("The Legends");
        team4.setRank(2);
        team4.addPlayer("Legend 1");
        team4.addPlayer("Legend 2");
        System.out.println(team4.toString());

        Team team5 = new Team("The Conquerors");
        team5.setRank(4);
        team5.addPlayer("Conqueror A");
        team5.addPlayer("Conqueror B");
        System.out.println(team5.toString());

        Team team6 = new Team("The Invincibles");
        team6.setRank(6);
        team6.addPlayer("Invincible 1");
        team6.addPlayer("Invincible 2");
        System.out.println(team6.toString());
    }
}
