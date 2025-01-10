package Demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartsWith1 {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(1,34,12,45,16,17);
        List<String> s=list.stream().map(n->n.toString()).filter(n->n.startsWith("1")).collect(Collectors.toList());
        System.out.println(s);
    }
}
