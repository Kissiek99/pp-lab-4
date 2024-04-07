
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Doe", 50000);
        employees[1] = new Employee("Jane Smith", 60000);
        employees[2] = new Employee("Mike Johnson", 55000);
        employees[3] = new Employee("Emily Davis", 62000);
        employees[4] = new Employee("Chris Lee", 53000);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(65000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
