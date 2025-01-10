package emplyeesort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String args[]){
        List<Employee> employees= Arrays.asList(new Employee(121,"john",20000,10),
                new Employee(122,"rohan",400000,20),new Employee(123,"john",30000,10),
                new Employee(124,"basheer",50000,30));

        employees.stream().sorted(Comparator.comparing(Employee::getName)).limit(1).forEach(e->System.out.println(e));
        //employees.stream().sorted(Comparator.comparing(Employee::getName,Comparator.reverseOrder())).forEach(e->System.out.println(e));
        //employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).forEach(e->System.out.println(e));
        //Map<Integer,List<Employee>> result=employees.stream().collect(Collectors.groupingBy(Employee::getDeptNo));
        //System.out.println(result);
        //employees.stream().filter(emp->emp.getDeptNo()==10).forEach(System.out::println);
       /* List<Employee> sortedList=employees.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).limit(3).collect(Collectors.toList());
        System.out.println(sortedList);*/
        List<Employee> sortedList=employees.stream().sorted(Comparator.comparing(Employee::getName)).limit(3).collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
