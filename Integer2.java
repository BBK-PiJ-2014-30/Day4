/**
 * Created by devon on 16/12/2014.
 */
public class Integer2 {
    public static void main(String[] args) {



    Integer2 i2 = new Integer2();
    System.out.println("Enter a number: ");
    String str = System.console().readLine();
    int i = Integer.parseInt(str);
    i2.setValue(i);
    System.out.println(" The number you entered is ");
     boolean a = true
     if (i2.isEven()== a ) { System.out.println("even."); }
    boolean a = i2.isOdd();
    else if (i2.isOdd()) {System.out.println ("odd."; }

    else { System.out.println ("undefined!! Your code is buggy!"); }

    int parsedInt = Integer.parseInt(i2.toString());
    if (parsedInt == i2.getValue()) ;
    { System.out.println("Your toString() method seems to work fine."); }

}
}
