import java.util.*;

class Employees{
    String empName;
    String empGender;
    long empId;
    int yearOfJoining;

    Employees(String empName, String empGender, long empId, int yearOfJoining) {
        this.empName = empName;
        this.empGender = empGender;
        this.empId = empId;
        this.yearOfJoining = yearOfJoining;
    }
}

class YearOfJoining implements Comparator<Employees>{
    public int compare(Employees o1, Employees o2) {
        return o1.yearOfJoining - o2.yearOfJoining;
    }
}


public class Q3_2 {
    public static void main(String[] args) {
        ArrayList<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees("John", "Male", 12345, 2020));
        employees.add(new Employees("Jane", "Female", 12445, 2019));
        employees.add(new Employees("Juan", "Male", 10935, 2023));

        Collections.sort(employees, new YearOfJoining());

        for (Employees e : employees) {
            System.out.println("Year of Joining : " + e.yearOfJoining);
        }

    }
}
