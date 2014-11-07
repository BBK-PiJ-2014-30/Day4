/**
 * Created by devon on 07/11/2014.
 */
public class Interest {
    double fixedRate = 1.7;
    double amount;
    double years;
    double interest;

    public Interest (double num1, double num2){
        this.amount = num1;
        this.years = num2;
        this.interest = (fixedRate/100)*amount;
    }


    double getInterest (){

       return interest*years;
   }
    double getYears () {
        double months = years * 52;
        double perMonth = (amount + interest) / months;
        double duration = interest/perMonth;
        return duration;
    }
}
