public class Main {
    public static void main(String[] args) {

        GameSystem system = new GameSystem(5, 5);


        Game g1 = new Game(1, "Cyber Quest", "Action", 299.95);
        Game g2 = new Game(2, "Farming Simulator", "Simulation", 149.50);
        system.addGame(g1);
        system.addGame(g2);


        Player p1 = new Player(101, "Anwar", 19, 1250.0);
        Player p2 = new Player(102, "Najib", 23, 3400.0);
        system.addPlayer(p1);
        system.addPlayer(p2);


        system.displayAllGames();
        System.out.println();
        system.displayAllPlayers();
        System.out.println();


        System.out.println("Samlet indtjening: " + system.calculateTotalRevenue() + " kr.");


        Player top = system.findTopScoringPlayer();
        if (top != null) {
            System.out.println("Topscorer: " + top.getName() + " med " + top.getScore() + " point!");
        }


        system.updatePlayerScore(101, 4500.0);


        top = system.findTopScoringPlayer();
        System.out.println("Ny topscorer er nu: " + top.getName() + " med " + top.getScore() + " point!");
    }
}