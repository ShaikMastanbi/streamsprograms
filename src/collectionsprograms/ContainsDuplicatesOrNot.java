package collectionsprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import static java.util.stream.Collectors.*;

public class ContainsDuplicatesOrNot {
    public static void main(String args[]){
        int arr[]={1,3,4,2,5,4};
        if(Arrays.stream(arr).distinct().count()!=arr.length){
            System.out.println("it contains duplicates values");
        }else{
            System.out.println("it does not contains the values");
        }
        IntStream.rangeClosed(1, 5).map(i -> i * i).skip(2).forEach(System.out::print);

        int ar[]={5,1,8,4,9,1,5};
        List<Integer> distinctElements=Arrays.stream(ar).distinct().boxed().collect(Collectors.toList());
        int sum=distinctElements.stream().mapToInt(n->n.intValue()).sum();
        System.out.println(sum);
    }


}
