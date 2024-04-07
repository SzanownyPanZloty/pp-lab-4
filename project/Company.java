package project;

public class Company {
  public static void main(String[] args) {
    // create employe array
    Employee[] Employees = {
        new Employee("John Doe", 5060),
        new Employee("Alex Brown", 60300),
        new Employee("Henry Max", 7500),
        new Employee("Amanda White", 80000),
        new Employee("Jill Doe", 8200),
    };

    System.out.println(Employees[3].getName() + " " + Employees[3].getSalary());
    Employees[3].setSalary(356000);

    for (Employee employee : Employees) {
      System.out.println(employee.getName() + " " + employee.getSalary());
    }

  }
}
