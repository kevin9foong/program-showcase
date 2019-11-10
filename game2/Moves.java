package game2;

public class Moves {
    private int moveID;
    private String name;
    private int damage;

    public Moves(int moveID, String name, int damage) {
        this.moveID = moveID;
        this.name = name;
        this.damage = damage;
    }

    public int getMoveID() {
        return moveID;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
