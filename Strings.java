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
//













  
