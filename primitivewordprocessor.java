import java.util.Scanner;
import static java.lang.System.out;

public class primitivewordprocessor {
    static String [] pre = new String [5];
    static void setuppre() {
        for (int x = 0; x < 5; x++) {
            pre [x] = "> ";
        }
    }

    public static void main (String [] args) {
        setuppre();
        Scanner sc = new Scanner(System.in);
        //out.print("line to replace (or -1 to quit)");

        int linenum = 5;//set to 5 as 5 is an out of bounds input and hence will not mess up the if else if else logical decision making statement.
        int prevnum;

        do {
            prevnum = linenum;
            out.print("line to replace (or -1 to quit)");
            linenum = sc.nextInt();
            if (linenum == -1) {
                break;
            }
            else if(linenum == prevnum || linenum >= 5) {
                out.println("error, try again.");
            }
            else {
                out.print("type input: ");
                sc.nextLine();//remember this is the fault of Scanner, the scanner cursor ends at the end of the nextint scanned, hence when nextline is called, it continues to scan till the end of the line which is nothing.
                String input = sc.nextLine();
                pre[linenum] += input;
                //pre[linenum] = sc.nextLine();

                for (int x = 0; x < 5; x++) {
                    out.println(pre [x]);
                }

            }
        } while (linenum < 5);

        sc.close();
    }
}
