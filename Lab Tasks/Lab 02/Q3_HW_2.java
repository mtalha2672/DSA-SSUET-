import java.util.*;
class EmployeeManagement {
    public HashSet<Employee> employees;

    public EmployeeManagement(){
        employees = new HashSet<>();
    }

    public void addEmployee(Employee emp){
        if (employees.contains(emp)){
            System.out.println("The employee is already in the system");
        } else {
            employees.add(emp);
            System.out.println("The employee is added to the system");
        }
    }

    public boolean checkEmployee(Employee emp){
        if (employees.contains(emp)){
            return true;
        } else {
            return false;
        }
    }

    public void displayEmployees(){
        for(Employee emp : employees){
            System.out.println(emp.empName);
        }
    }
}


public class Q3_HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();
        boolean condition = true;
        while (condition) {
            System.out.println();
            System.out.println("Press \"1\" to add new employee");
            System.out.println("Press \"2\" to check employee");
            System.out.println("Press \"3\" to display employees");
            System.out.println("Press \"4\" to exit");
            System.out.println();

            int user = sc.nextInt();
            sc.nextLine();

            switch (user) {
                case 1:
                    System.out.print("Enter employee name : ");
                    String employeeName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter employee ID : ");
                    int employeeID = sc.nextInt();
                    em.addEmployee(new Employee(employeeID, employeeName));
                    break;

                case 2:
                    System.out.print("Enter employee name : ");
                    employeeName = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter employee ID : ");
                    employeeID = sc.nextInt();
                    System.out.println(em.checkEmployee(new Employee(employeeID, employeeName)));
                    break;

                case 3:
                    em.displayEmployees();
                    break;

                case 4:
                    condition = false;
            }
        }
    }
}



