// longest subarray

public class Main{
    public static void main(String[]args){
        int[] arr = {2,5,1,10,10};
        int k = 14;
        int n = arr.length;
        int l = 0;int r=0;
        int maxlen = 0;
        int R = 0;
        int L = 0;
        int sum = 0;
        while(r < n){
            
            sum += arr[r];
            while(sum > k && l <= r){
                sum -= arr[l];
                l++;
            }
            if(sum <= k && maxlen < (r-l+1)){
                maxlen = (r-l+1);
                R = r;
                L = l;
            }
            r++;
        }
        System.out.println(maxlen+" "+L+" "+R);
    }
}
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

// maximum points you can obtain from cards.
// k is no. of cards to be considered. you can count consecutive cards.
//u can count first cards and last cards imagining they are circular i.e u can consider (6,2,1,7) from [6,2,3,4,7,2,1,7,1] 

public class Main{
    public static void main(String[]args){
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] arr , int k ){
        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        int l = 0;
        int r = n-1;
        int maxsum = 0;
        
        for(int i = 0; i < k ; i++){
            lsum += arr[i];
            
        }
        maxsum = lsum;
        for(int i = k-1 ; i >= 0 ; i--){
            lsum -= arr[i];
            rsum += arr[r];
            if(maxsum < lsum+rsum){
                maxsum = lsum+rsum;
            }
            r--;
        }
        
        
        return maxsum;
    }
}

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

// print longest substring without repeating characters

import java.util.*;
public class Main{
    public static void main(String[]args){
        String s = "cadbzabcd";
        
        System.out.println(longestSubstring(s));
    }
    public static String longestSubstring(String s ){
        HashMap<Character,Integer> hash = new HashMap<>();
        
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int L = 0;
        int R = 0;
        
        while(r < n){
            char ch = s.charAt(r);
            if(hash.containsKey(ch) && hash.get(ch)>=l){
                l = hash.get(ch) + 1;
            }
            if(maxlen<r-l+1){
                maxlen = (r-l+1);
                L = l;
                R = r;
            }
            
            hash.put(ch,r);
            
            r++; 
        }
       
        return s.substring(L,R+1);
    }
}
