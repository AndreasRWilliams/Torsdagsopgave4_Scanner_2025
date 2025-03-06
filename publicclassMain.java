public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("De Uovervindelige");
        team1.setRank(3);
        team1.addPlayer("Peter");
        team1.addPlayer("Alex");
        team1.addPlayer("Emma");

        Team team2 = new Team("Vikings");
        team2.setRank(2);
        team2.addPlayer("Thor");
        team2.addPlayer("Loki");

        Team team3 = new Team("Stormriders");
        team3.setRank(1);
        team3.addPlayer("Preben");
        team3.addPlayer("Else");

        Team team4 = new Team("Shadow Warriors");
        team4.setRank(5);
        team4.addPlayer("Kaj");

        Team team5 = new Team("Fire Dragons");
        team5.setRank(4);
        team5.addPlayer("Robert");

        Team team6 = new Team("Lightning Hawks");
        team6.setRank(6);
        team6.addPlayer("Simon");

        // Printing teams
        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
        System.out.println(team6);
    }
}
