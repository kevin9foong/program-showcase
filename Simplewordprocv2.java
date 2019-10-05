import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
//args[0] is the file to read from.
//args[1] is the file to write to.
//everything is declared static since we are using the cmd line arg to input file to read/write to, hence this prog can basically only deal with 1 file at each run.

public class Simplewordprocv2 {
    static int linenum;
    static String tempDoc[];//creates tempDoc on memory

    public static void main(String args[]) throws IOException {
        if (args.length < 2) {
            out.println("usage: filetoread.txt filetoprint.txt");
            System.exit(1);//terminates program
        }
        out.println("Put -1 in line of file to terminate copying");
        readFile(args[0]);
        writeFile(args[1]);
    }

    public static void readFile(String args0) throws IOException {
        linenum = 0;
        BufferedReader br = new BufferedReader(new FileReader(args0));
        while (! br.readLine().equals("-1")) {
            linenum++;
        }
        tempDoc = new String[linenum+1];
        br = new BufferedReader(new FileReader(args0));//to reset cursor to start.
        for (int line = 0; line < linenum; line++) {
            tempDoc[line] = br.readLine();
            out.println(tempDoc[line]);
        }
            br.close();
    }
    public static void writeFile(String args1) throws IOException {
        PrintStream ps = new PrintStream(args1);
        for (int line = 0; line < linenum; line++) {
            ps.println(tempDoc[line]);
        }
        ps.close();
    }
}
