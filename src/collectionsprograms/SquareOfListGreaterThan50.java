package collectionsprograms;

import java.util.Arrays;
import java.util.List;

public class SquareOfListGreaterThan50 {
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(2,3,4,5,3,2,7,10,12);
        nums.stream().mapToInt(n->n.intValue()).map(n->n*n).filter(n->n>50).forEach(System.out::println);
    }
}
