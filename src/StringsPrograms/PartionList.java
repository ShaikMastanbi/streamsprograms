package StringsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//we have do even and odd partion
public class PartionList {
    public static void main(String args[]){
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean,List<Integer>> result=values.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result);
    }
}
