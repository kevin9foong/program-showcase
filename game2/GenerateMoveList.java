package game2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GenerateMoveList {
    public static void main(String[] args) {
        LinkedList<Moves> moveList = new LinkedList<>();
        Map <Integer, Index> index = new HashMap<>();
        moveList.add(new Moves(1, "Bankai", 100));
        moveList.add(new Moves(2, "Shikai", 60));
        moveList.add(new Moves(3, "Chidori", 80));
        moveList.add(new Moves(4, "Rasengan", 85));

       try (RandomAccessFile raOut = new RandomAccessFile("attackList.dat", "rwd")){
           raOut.writeInt(moveList.size());

           int movesStart = (int) raOut.getFilePointer() + Integer.BYTES + Integer.BYTES*3*moveList.size();
           raOut.writeInt(movesStart);

           raOut.seek(movesStart);
           for (Moves move : moveList) {

               StringBuilder sb = new StringBuilder();
               sb.append(move.getMoveID());
               sb.append(",");
               sb.append(move.getName());
               sb.append(",");
               sb.append(move.getDamage());
               sb.append(",");

               int startIndex = (int) raOut.getFilePointer();
               raOut.writeUTF(sb.toString());

               index.put(move.getMoveID(), new Index(move.getMoveID(), startIndex, (int)raOut.getFilePointer() - startIndex));
               startIndex = (int) raOut.getFilePointer();
           }

           raOut.seek(8);
           for (Index ind : index.values()) {
               raOut.writeInt(ind.getMoveID());
               raOut.writeInt(ind.getStart());
               raOut.writeInt(ind.getLength());
           }
        } catch (IOException e) {}
    }
}
