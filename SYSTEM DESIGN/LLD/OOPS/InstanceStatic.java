class Player{
    String name;
    int health = 100;
    static int playerCount = 0;
    public Player(String name) {
        this.name = name;
        playerCount++;
    }
    public void takeDamage(int damage) {
        this.health -= damage;
    }
    public static void displayGameRules() {
        System.out.println("The last standing player wins!!!");
    }
}

public class InstanceStatic {
    public static void main(String[] args) {
        Player.displayGameRules();
        Player p1 = new Player("Shreya");
        Player p2 = new Player("Sudhi");
        p1.takeDamage(20);
        System.out.println(p1.health);
        System.out.println(p2.health);
        System.out.println(Player.playerCount);
    }
}