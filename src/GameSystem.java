public class GameSystem {
    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;


    public GameSystem(int maxGames, int maxPlayers) {
        games = new Game[maxGames];
        players = new Player[maxPlayers];
        gameCount = 0;
        playerCount = 0;
    }

    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Spil-arrayet er fuldt!");
        }
    }


    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Spiller-arrayet er fuldt!");
        }
    }


    public void displayAllGames() {
        System.out.println("--- Oversigt over spil ---");
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }


    public void displayAllPlayers() {
        System.out.println("--- Oversigt over spillere ---");
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }


    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameID() == gameId) {
                return games[i];
            }
        }
        return null;
    }


    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i];
            }
        }
        return null;
    }


    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);
        if (player != null) {
            player.updateScore(newScore);
            System.out.println("Score opdateret for spiller: " + player.getName());
        } else {
            System.out.println("Spiller med ID " + playerId + " blev ikke fundet.");
        }
    }


    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < gameCount; i++) {
            totalRevenue += games[i].getPrice();
        }
        return totalRevenue;
    }


    public Player findTopScoringPlayer() {
        if (playerCount == 0) {
            return null;
        }
        Player topPlayer = players[0];
        for (int i = 1; i < playerCount; i++) {
            if (players[i].getScore() > topPlayer.getScore()) {
                topPlayer = players[i];
            }
        }
        return topPlayer;
    }
}

