import java.util.*;
class Employee {
    String empName;
    int empID;

    Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Employee emp = (Employee) obj;
        return emp.empID == this.empID && emp.empName.equals(this.empName);
    }
    public int hashCode() {
        return this.empID;
    }
}

public class Q3_HW {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(12, "John");

        if (e1.hashCode() == e2.hashCode()) {
            if (e1.equals(e2)) {
                System.out.println("Both employees are the same");
            } else {
                System.out.println("Both employees are not the same");
            }
        } else {
            System.out.println("Both employees are not the same");
        }
    }
}
