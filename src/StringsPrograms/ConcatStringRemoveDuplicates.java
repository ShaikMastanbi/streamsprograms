package StringsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatStringRemoveDuplicates {
    public static void main(String args[]){
        List<String> names1= Arrays.asList("bobi","mastanbi","shainy","jai","madhu");
        List<String> names2= Arrays.asList("john","mastanbi","pavani","jai","balu");
        Stream.concat(names1.stream(),names2.stream()).distinct().forEach(System.out::println);
    }
}
