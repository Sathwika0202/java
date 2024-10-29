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
