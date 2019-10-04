//finds empty room and updates txt file when new members are checked in

import java.io.*;

import static java.lang.System.out;

public class hotelgp1data {
    public static void main (String [] args) throws IOException {
        //create file reader
        BufferedReader br = new BufferedReader(new FileReader("src/hotelgp.txt"));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int guests [] = new int [5];
        int roomNum;
        for (roomNum = 0; roomNum < guests.length; roomNum++) {
            guests[roomNum] = Integer.parseInt(br.readLine());
        }
        roomNum = 0;
        while (roomNum < guests.length && guests[roomNum] != 0) {
            roomNum++;
        }
        if (roomNum == 5) {
            out.println("Sorry. There are no vacancies today.");
        }
        else {
            out.print("Congrats! Room "+roomNum+" is empty.\n");
            out.print("How many guests would you like to check in?: ");
            guests[roomNum] = Integer.parseInt(input.readLine());
            out.println();
            out.println("You have successfully checked into room "+roomNum+" for "+guests[roomNum]+". Thank you.");
        }

        br.close();
        input.close();
        PrintStream ps = new PrintStream("hotelgp.txt");
        for (roomNum = 0; roomNum < guests.length; roomNum++) {
            ps.println(guests[roomNum]);
        }
    }
}
