package Demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,2,3,2,3,4,5,6,4);
        List<Integer> uniqueList= list.stream().distinct().collect(Collectors.toList());
        uniqueList.forEach(System.out::println);
    }
}
