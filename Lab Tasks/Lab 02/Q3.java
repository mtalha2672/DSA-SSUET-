import java.util.*;

class Employee1 implements Comparable<Employee1>{
    String empName;
    String empGender;
    long empId;
    int yearOfJoining;

    Employee1(String empName, String empGender, long empId, int yearOfJoining) {
        this.empName = empName;
        this.empGender = empGender;
        this.empId = empId;
        this.yearOfJoining = yearOfJoining;
    }

    public int compareTo(Employee1 o) {
        return this.yearOfJoining - o.yearOfJoining;
    }
}


public class Q3 {
    public static void main(String[] args) {
        ArrayList<Employee1> employees1 = new ArrayList<Employee1>();
        employees1.add(new Employee1("John", "Male", 12345, 2020));
        employees1.add(new Employee1("Jane", "Female", 12445, 2019));
        employees1.add(new Employee1("Juan", "Male", 10935, 2023));

        Collections.sort(employees1);

        for (Employee1 e : employees1) {
            System.out.println("Year of Joining : " + e.yearOfJoining);
        }

    }
}

