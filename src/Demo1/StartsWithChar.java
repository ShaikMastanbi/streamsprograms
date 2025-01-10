package Demo1;

import java.util.Arrays;
import java.util.List;

public class StartsWithChar {
    public static void main(String args[]){
        List<String> values = Arrays.asList("son", "boy", "apple", "mastanbi");
        long count=values.stream().filter(e->e.startsWith("a")).count();
        System.out.println(count);
    }
}
