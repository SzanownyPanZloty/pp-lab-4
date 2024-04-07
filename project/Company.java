package project;

import project.employees.Employee;
import project.employees.Manager;
import project.employees.Worker;

public class Company {
  public static void main(String[] args) {
    // create employe array
    Employee[] Employees = {
        new Manager("John Doe", 5060, 0),
        new Worker("Alex Brown", 60300, "random position 1"),
        new Employee("Henry Max", 7500),
        new Employee("Amanda White", 80000),
        new Worker("Jill Doe", 8200, "random position 2"),
    };

    System.out.println(Employees[3].toString());
    Employees[3].setSalary(356000);

    for (Employee employee : Employees) {
      System.out.println(employee.toString());
    }

  }
}
