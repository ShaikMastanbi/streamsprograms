package collectionsprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortElements {
    public  static void main(String args[]){
        List<Integer> nums= Arrays.asList(2,3,4,5,3,2,7);
        //nums.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
