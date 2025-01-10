package Demo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String args[]){
        List<Integer> values= Arrays.asList(1,4,3,5,3,7);
       int secondLargestNumber= values.stream()
               .distinct()
               .sorted(Comparator.reverseOrder())
               .skip(1)
               .findFirst()
               .get();
       System.out.println(secondLargestNumber);
    }
}
