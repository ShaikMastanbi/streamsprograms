package Demo1;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String arg[]){
        List<Integer> list= Arrays.asList(2,3,4,2,5,6);
        int min=list.stream().mapToInt(n->n.intValue()).min().getAsInt();
        int max=list.stream().mapToInt(n->n.intValue()).max().getAsInt();
        System.out.println(max);
        System.out.println(min);
    }
}
