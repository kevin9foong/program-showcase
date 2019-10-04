import static java.lang.System.out;
//with this import declaration, the code is shortened and more readable, as System.out.println is now just out.println.

public class VariableUpdatesnModulo
{
    public static void main(String[] args) {
        int totalCents = 1111;
//insert the total number of cents here where '1244' is and run.
        
        int DollarCoins = totalCents/100;
        int remainingCents = totalCents%100;
        
        int FiftyCentCoins = remainingCents/50;
        remainingCents = remainingCents % 50;
        
        int TwentyCentCoins = remainingCents/20;
        remainingCents = remainingCents % 20;
        
        int TenCentCoins = remainingCents /10;
        remainingCents = remainingCents % 10;
        
        int FiveCentCoins = remainingCents /5;
        remainingCents = remainingCents % 5;
        
        int OneCentCoins = remainingCents /1;
        remainingCents = remainingCents % 1;
        
        int totalCoins = DollarCoins + FiftyCentCoins + TwentyCentCoins + TenCentCoins  + FiveCentCoins + OneCentCoins ;
        
        out.println("With "+totalCents+" cents, you have: ");
        out.println(DollarCoins + " dollars");
        out.println(FiftyCentCoins + " fifty-cent coins");
        out.println(TwentyCentCoins + " twenty-cent coins");
        out.println(TenCentCoins + " ten-cent coins");
        out.println(FiveCentCoins + " five-cent coins");
        out.println(OneCentCoins + " one-cent coins");
        out.println("The minimum number of coins required is " + totalCoins + " coins.");
//instead of System.out.println, its just out.println
        
        
    }
}
