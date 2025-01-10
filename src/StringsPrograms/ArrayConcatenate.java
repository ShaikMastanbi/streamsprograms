package StringsPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class
ArrayConcatenate {
    public static void main(String args[]){
        int arr1[]={1,2,3,4};
        int arr2[]={2,3,4,5};
        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().forEach(System.out::println);

    }
}
