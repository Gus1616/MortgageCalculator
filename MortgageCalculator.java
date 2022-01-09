
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.BreakIterator;
import java.text.NumberFormat;


public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("enter your principal amount: ");
            int principal = scanner.nextInt();
            if (principal <= 0){
                System.out.println("error, principal amount must be greater than zero");
                break;
            
            }



            System.out.print("enter your annual interest rate: ");
            float air = scanner.nextFloat();
            if (air <= 0){
                System.out.println("error, interest amount must be greater than zero");
                break;
            
            }

            System.out.print("enter your period in years: ");
            int period = scanner.nextInt();
            if (period <= 0){
                System.out.println("error, amount of years must be greater than zero");
                break;
            
            }

            float r = (air / 12)/100;

            int payments = (period*12);

            double a = r+1;
            double b = payments;

            double top = r*(Math.pow(a,b));

            double bottom = (Math.pow(a,b))-1;

            double Mortgage = principal * (top/bottom);


            NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
            String result = currency.format(Mortgage);
            System.out.println(result+" this is your mortagage");


            }







        


    }
}