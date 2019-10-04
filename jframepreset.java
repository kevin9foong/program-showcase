//shows a basic gui input and output to display guests in each room without having to open the txt file.

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")//suppresses warnings when JFrame is extended something to do with SerialUID.
public class jframepreset extends JFrame {
    //int guests [] = {1, 2, 3, 2, 1};//array initializer.
    int guests [];//creates variable but yet to refer to array as array has not yet been instantiated.
    public void assignRoom() throws IOException {
        guests = new int [5];
        BufferedReader fr = new BufferedReader(new FileReader("src/hotelgp.txt"));
         for (int roomNum = 0; roomNum < 5; roomNum++) {
             guests[roomNum] = Integer.parseInt(fr.readLine());
         }
         fr.close();//close for good practice to prevent conflict
    }

    public jframepreset() throws IOException{
        assignRoom();

        setTitle("room guest display");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        //setSize(500,400);
        pack();
        setVisible(true);

        int roomnum;
        roomnum = Integer.parseInt(JOptionPane.showInputDialog("input room number: "));

        add(new JLabel("room number "+roomnum+":  "));
        add(new JLabel(String.valueOf(guests[roomnum])));
        revalidate();
        pack();
    }

    public static void main (String [] args) throws IOException{
        jframepreset roomguestdisplay = new jframepreset();
    }
}
