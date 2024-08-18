/*write a code to print the foll input and output acc.
  input: a5b10                            input : c6b3h2 
  output: aaaaabbbbbbbbbb                 output: ccccccbbbhh      */


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int len = 0;
        while(len<inp.length()){
            int range = 0;
            char p = inp.charAt(len);
            int w = inp.charAt(len+1)-'0';
            int w1 = inp.charAt(len+2)-'0';
            if(w1<10 && w1>=0){
                range = w1+w*10;
                len+=3;
            }else{
                len+=2;
                range = w;
            }
            for(int i=0; i<range;i++){
                System.out.print(p);
            }
        }
    }
}

/* ```````````````````````````````````````````````````````````````````````````````````````````````
````````````````````````````````````````````````````````````````````````````````````````````````*/



