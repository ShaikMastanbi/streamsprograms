package collectionsprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static java.util.Collections.frequency;

public class firstchar {
    public static void main(String args[]){
        String s="hello";
        //s.chars().mapToObj(c->(char) c).filter(c->frequency(Collections.singleton(s),c)>1).limit(1).forEach(System.out::println);
        Optional<Character> ch=s.chars().mapToObj(c->(char) c).findFirst();
        System.out.println(ch);
    }
}
