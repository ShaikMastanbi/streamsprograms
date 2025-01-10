package studentsort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSort {
    public static void main(String args[]){
        List<Student> students= Arrays.asList(new Student("john",70),
                new Student("sam",65),
                new Student("basheer",68),
                new Student("pavani",58),
                new Student("raj",89));
       Map<String,List<Student>> result= students.stream().collect(Collectors.groupingBy(stu->stu.getMarks()>60 ?"pass":"fail"));
       System.out.println(result);
    }
}
