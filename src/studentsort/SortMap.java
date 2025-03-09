package studentsort;

import java.util.HashMap;
import java.util.Map;

public class SortMap {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mastanbi",21);
        map.put("pavani",23);
        map.put("janu",25);
        map.put("basheer",31);
        map.put("abhi",18);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("---------------");

        map.forEach((key,value)->System.out.println(key+"->"+value));


    }
}
