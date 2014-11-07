import java.util.Scanner;

/**
 * Created by devon on 07/11/2014.
 */
import java.util.Scanner;


public class Mortgage {


    public static void main ( String args []){






        Scanner input = new Scanner (System.in);
        System.out.println(" borrowed amount: ");
        double cash = input.nextDouble();
        System.out.println(" years of loan to be repaired: ");
        double years = input.nextDouble();
        Interest d = new Interest(cash,years);


        String s = String.format(" amount of months it will take to pay of the interest is:  %.2f", d.getYears() );
        System.out.println(" interest paid on a fixed rate of 1.7: " +  d.getInterest());
        System.out.println(s);










    }
}
