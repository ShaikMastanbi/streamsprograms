package Demo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.frequency;


public class PrintDuplicates {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(1,12,23,23,45,67,1,12);
        nums.stream().filter(n-> frequency(nums,n)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
