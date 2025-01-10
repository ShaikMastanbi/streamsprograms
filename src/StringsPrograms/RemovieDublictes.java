package StringsPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovieDublictes {
    public static void main(String args[]){
        String s="hello world people and hello people";
       // Arrays.stream(s.split(" ")).distinct().forEach(System.out::println);
       String result=s.chars().mapToObj(c->String.valueOf((char) c)).distinct().collect(Collectors.joining());
       System.out.println(result);

    }
}
