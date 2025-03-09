package StringsPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class
FrequencyOfChar {
    public static void main(String args[]){
        String s="Hello world";
        String Vowels="aeiouAEIOU";
      Map<Character,Long> map= s.chars().mapToObj(c->(char) c)
              //.filter(c->Vowels.indexOf(c)!=-1)
              .filter(c->!Character.isWhitespace(c))
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(map);
    }
}
