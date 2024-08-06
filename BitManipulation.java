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

//clear bits  

class Main{
    public static void main(String[]args){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}


/*---------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------*/

// Update bit

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        
        int bitMask = 1<<pos;
        if(oper == 1){
            int newNum = bitMask | n;
            System.out.println(newNum);
        }else{
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
            
        }
        
        
    }
}












