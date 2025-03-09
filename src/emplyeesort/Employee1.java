package emplyeesort;

public class Employee1 {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String designation;
    private int year;
    private double salary;

    public Employee1(int id, String name, int age, String gender, String designation, int year, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.year = year;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", designation='" + designation + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                '}';
    }
}
