// get bits
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n =5;
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
}

/*---------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------*/

//set bits

class Main{
    public static void main(String[]args){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        
        int newNum = bitMask|n;
        System.out.println(newNum);
    }
}



/*---------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------*/

//















