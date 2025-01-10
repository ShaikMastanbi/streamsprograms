package Demo1;

import java.util.Arrays;
import java.util.List;

public class StringUpperCase {
    public static void main(String args[]){
        List<String> values= Arrays.asList("son","boy","apple","mastanbi");
        values.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
