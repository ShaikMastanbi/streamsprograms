package StringsPrograms;

import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//group with firtst charecter and count
public class GroupByNames {
    public static void main(String args[]){
        String names[]= {"bobi","mastanbi","shainy","jai","madhu"};
        Map<Character,Long> values=Arrays.stream(names).collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
        System.out.println(values);
    }
}
