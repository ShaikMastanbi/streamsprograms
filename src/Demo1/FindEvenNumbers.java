package Demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String args[]){
        List<Integer> integers= Arrays.asList(2,3,6,4,7,8);
        List<Integer> evenNubers=integers.stream().filter(n->n%2==0)
                .sorted()
                .map(n->n*2)
                .collect(Collectors.toList());
        evenNubers.forEach(System.out::println);
    }
}
