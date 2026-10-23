public class Player {
    private int playerId;
    private String name;
    private int age;
    private double score;

    // Konstruktør
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getter- og setter-metoder
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Metode til at vise spillerens detaljer
    public void displayDetails() {
        System.out.println("Spiller ID: " + playerId + " | Navn: " + name + " | Alder: " + age + " | Score: " + score);
    }

    // Metode til at opdatere spillerens score
    public void updateScore(double newScore) {
        this.score = newScore;
    }
}

