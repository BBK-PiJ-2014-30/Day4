/**
 * Created by devon on 16/12/2014.
 */
public class Integer {
    int value;
    int getValue(){

        return value;
    }
    void setValue(int a ){
        this.value = a;
    }
    boolean isEven(){
        boolean even;
        int num = getValue();
        if( num%2 ==0){
            even = true;
            return true;
        }
        else return false;
    }

    boolean isOdd(){

        boolean odd;
        int num = getValue();
        if ( num%2  !=0 ){
            odd = true;
            return odd;

        }
        else return false;


    }
    void prettyPrint (){
        System.out.println(getValue());
    }

    String toString (){


    }


}
