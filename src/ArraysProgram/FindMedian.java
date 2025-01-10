package ArraysProgram;

import java.util.Arrays;

public class FindMedian {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        double median=findMedian(arr);
        System.out.println(median);

    }
    public static double findMedian(int arr[]){
        Arrays.sort(arr);
        int n= arr.length;
        if(n%2==1){
            return arr[n/2];
        }else {
            return(arr[n-1]/2+arr[n/2])%2.0;
        }
    }
}
