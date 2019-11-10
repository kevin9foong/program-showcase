package game2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;

public class Character {
    private int level;
    private int hp;
    private String name;
    private Map<Integer, Moves> movelist;

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Moves> getMovelist() {
        return movelist;
    }

    public Character(String name, int level) {
        this.level = level;
        this.name = name;
        movelist = new LinkedHashMap<>();
        hp = level * 5;
        learnMoves();
    }
    public void attack(Character c, int moveID) {
        c.hp = c.getHp() - movelist.get(moveID).getDamage();
        if (c.hp <= 0) {
            System.out.println(c.getName() + " has been defeated. ");
        }
        else {
            System.out.println(c.getName() + " remaining HP: " + c.hp);
        }
    }
    public void learnMoves() {
        Map<Integer, Index> index = new LinkedHashMap<>();
         try (RandomAccessFile raIn = new RandomAccessFile("attackList.dat", "rwd")) {
            raIn.seek(4);
            int moveStart = raIn.readInt();

            while (raIn.getFilePointer() < moveStart) {
                int moveID = raIn.readInt();
                int startByte = raIn.readInt();
                int length = raIn.readInt();

                Index ind = new Index(moveID, startByte, length);
                index.put(moveID, ind);
            }
            int targetByte = index.get(3).getStart();
            raIn.seek(targetByte);
            String targetString = raIn.readUTF();
            String [] targetArr = targetString.split(",");
            movelist.put(Integer.parseInt(targetArr[0]), new Moves(Integer.parseInt(targetArr[0]), targetArr[1], Integer.parseInt(targetArr[2])));

        } catch (IOException e) {}

    }
}
