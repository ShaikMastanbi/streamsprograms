package collectionsprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.frequency;

public class PrintDupicates {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(2,3,4,5,3,2,7);
        nums.stream().filter(n->frequency(nums,n)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
