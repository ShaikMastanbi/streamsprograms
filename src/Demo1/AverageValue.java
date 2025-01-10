package Demo1;

import java.util.Arrays;
import java.util.List;

public class AverageValue {
    public static void main(String args[]){
        List<Double> list= Arrays.asList(1.4,3.5,4.0,7.4,6.2);
       double avg=list.stream().mapToDouble(n->n.doubleValue()).average().getAsDouble();
       System.out.println(avg);
    }
}
