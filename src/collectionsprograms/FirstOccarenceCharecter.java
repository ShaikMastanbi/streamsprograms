package collectionsprograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccarenceCharecter {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(2,3,4,5,3,2,7);
        Map<Integer,Long> map= nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        Optional<Integer> n=nums.stream().findFirst();
        System.out.println(n);
       System.out.println(nums.stream().count());

       nums.stream().map(no->no.toString()).filter(no->no.startsWith("5")).forEach(System.out::println);
       //find duplicates



    }
}
