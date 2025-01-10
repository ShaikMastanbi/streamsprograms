package Demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenatingString {
    public static void main(String args[]) {
        List<String> values = Arrays.asList("son", "boy", "apple", "mastanbi");
        String s=values.stream().collect(Collectors.joining(":"));
        System.out.println(s);
    }

}
