package collectionsprograms;

import java.util.Arrays;

public class ContainsDuplicatesOrNot {
    public static void main(String args[]){
        int arr[]={1,3,4,2,5,4};
        if(Arrays.stream(arr).distinct().count()!=arr.length){
            System.out.println("it contains duplicates values");
        }else{
            System.out.println("it does not contains the values");
        }
    }
}
