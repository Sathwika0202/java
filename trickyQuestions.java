/*write a code to print the foll input and output acc.
  input: a5b10                            input : c6b3h2 
  output: aaaaabbbbbbbbbb                 output: ccccccbbbhh      */


public class ExpandString {
    public static void main(String[] args) {
        String input1 = "a5b10";
        String input2 = "c6b3h2";

        System.out.println(expand(input1)); // Output: aaaaabbbbbbbbbb
        System.out.println(expand(input2)); // Output: ccccccbbbhh
    }

    public static String expand(String input) {
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);
            i++;
            int count = 0;

            // Handling multi-digit numbers
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }

            // Append the character 'count' number of times
            for (int j = 0; j < count; j++) {
                output.append(currentChar);
            }
        }

        return output.toString();
    }
}


/* ```````````````````````````````````````````````````````````````````````````````````````````````
````````````````````````````````````````````````````````````````````````````````````````````````*/

// two sum 

import java.util.HashMap;
import java.util.Arrays;
class Maps {
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        int n =arr.length;
        
        for(int i = 0; i < n; i++){
            map.put(arr[i],i);
            
        }
        for(int i=0;i<n;i++){
            int compliment = target-arr[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i){
                return new int[] {i,map.get(compliment)};
                
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]= {3,2,1,4};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}


/* ```````````````````````````````````````````````````````````````````````````````````````````````
````````````````````````````````````````````````````````````````````````````````````````````````*/

//sum of multiple of 1 to 10 of p.

public class Main{
    /*public static int multiple(int i,int n,int sum){
        
        if(i==n+1){
            return sum;
        }
        sum += n*i;
        return (multiple(i+1,n,sum));
    }
    public static void main(String[]args){
        System.out.println(multiple(1,10,0));
    }*/
    public static void main(String[]args){
        int p = 10;
        int n = 10;
        int sum = (n*(n+1))/2;
        sum*=p;
        
        System.out.println(sum);
    }
}
