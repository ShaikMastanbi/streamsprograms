package Demo1;

import java.util.Arrays;
import java.util.List;

public class First3EvenSquare{
    public static void main(String args[]){
        List<Integer> nums= Arrays.asList(1,2,3,4,6,5,7);
        nums.stream().filter(n->n%2==0).limit(3).map(n->n*n).forEach(System.out::println);
    }
}
