import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

       
        employees[0] = new Manager("Krystian Wojdyna", 50000, 0);
        employees[1] = new Worker("Przemysław Zaremski", 60000, "Deweloper");
        employees[2] = new Employee("Sylwia Poznańska", 55000);
        employees[3] = new Worker("Dajana Majda", 65000, "Księgowa");
        employees[4] = new Worker("Julita Reklińska", 70000, "Menedżer marketingu");
        employees[5] = new Manager("Jan Ćwik", 60000, 0);
        employees[6] = new Worker("Jadwiga Maj", 55000, "Specjalista HR");

        
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); /
                employee.setSalary(75000); 
            }
        }

        
        System.out.println("Zaktualizowane dane pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}