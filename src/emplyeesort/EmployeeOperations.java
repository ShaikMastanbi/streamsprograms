package emplyeesort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String args[]) {
        List<Employee1> emp = new ArrayList<>();
        emp.add(new Employee1(1, "john", 32, "mail", "hr", 2013, 67700.00));
        emp.add(new Employee1(2, "mastanbi", 25, "femail", "developer", 2022, 501000.00));
        emp.add(new Employee1(3, "basheer", 26, "mail", "devapps", 2025, 87000.00));
        emp.add(new Employee1(4, "dp", 42, "mail", "frontend", 2014, 500000.00));
        emp.add(new Employee1(5, "pavani", 22, "femail", "hr", 2022, 67700.23));
//maxsalary find
        Optional<Employee1> e = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee1::getSalary)));
        System.out.println(e);

        //find second max salary
        Optional<Employee1> e2 = emp.stream().sorted(Comparator.comparing(Employee1::getSalary, Comparator.reverseOrder())).skip(1).findFirst();
        System.out.println(e2);


    }
}
