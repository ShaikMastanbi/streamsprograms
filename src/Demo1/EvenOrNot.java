package Demo1;

import java.util.Arrays;
import java.util.List;

public class EvenOrNot {
    public static void main(String args[]){
        List<Integer> integers= Arrays.asList(2,3,6,4,7,8);
        boolean b=integers.stream().allMatch(n->n%2==0);
        System.out.println(b);
    }
}
