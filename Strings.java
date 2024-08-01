// basic code for defining strings

import java.util.*;
public class Main{
    public static void main(String[]args){
        String name="Tony";
        String fullName = "Tony starl";
        System.out.println(name+fullName);
    }
}

/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
// basic methods

import java.util.*;
public class Main{
    public static void main(String[]args){
        //concateation
        String firstName="Tony";
        String lastName = "strak";
        String fullName = firstName+"@"+lastName;
        System.out.println(fullName.length());
        System.out.println(fullName);
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}



/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
// using compare to function

import java.util.*;
public class Main{
    public static void main(String[]args){
        //compare Strings
        String s1="tony";
        String s2="tony";
        
        //1 s1 > s2 : +ve value
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value
        
        //hello wello
        
        if(s1.compareTo(s2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        
    }
}

/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
//substrings

public class Main{
    public static void main(String[]args){
        String sent = "My name is Tony";
        // substring(begin index , end index);     end index is exclusive
        String name = sent.substring(11, sent.length());
        System.out.println(name);
        
    }
}


public class Main{
    public static void main(String[]args){
        String sent = "TonyStark";
        // substring(begin index , end index);     end index is exclusive
        String name = sent.substring(4);
        System.out.println(name);
        
    }
}

/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
//StringBuilder basic functions
public class Main{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        // char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        
        // insert a char at index 0
        sb.insert(3,'n');
        System.out.println(sb);
        
        //delete the extra 'n'
        //delete(begin index, end index)     end index is exclusive
        sb.delete(3,4);
        System.out.println(sb);
        
        sb.setCharAt(0,'T');
        sb.delete(2,3);
        System.out.println(sb);
        
        
    }
}

/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
// append function

public class Main{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append('l');
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
           
    }
}

/*-------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------*/
// reverse a string using stringBuilder

public class Main{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        
        for(int i=0 ; i<sb.length()/2 ; i++){
            int front = i;
            int back = sb.length()-1-i;
            
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}











  
