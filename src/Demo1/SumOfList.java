package Demo1;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,3,3,4,5,6);
       int result= list.stream().mapToInt(n->n.intValue()).sum();
       System.out.println(result);
    }
}
