package StringsPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsFrequency {
    public static void main(String args[]){
        String str="hello world people and hello people";
        Map<String,Long> map=Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s.toLowerCase(),Collectors.counting()));
        System.out.println(map);
    }
}
