package game2;

public class Index {
    private int moveID;
    private int start;
    private int length;

    public Index(int moveID, int start, int length) {
        this.moveID = moveID;
        this.start = start;
        this.length = length;
    }

    public int getMoveID() {
        return moveID;
    }

    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }
}
