package project;

import java.util.ArrayList;
import java.util.List;

import project.employees.Employee;
import project.employees.Manager;
import project.employees.Worker;

public class Company {
  public static void main(String[] args) {

    List<Employee> Employees = new ArrayList<Employee>();
    Employees.add(new Manager("John Doe", 5060, 0));
    Employees.add(new Worker("Alex Brown", 60300, "random position 1"));
    Employees.add(new Employee("Henry Max", 7500));
    Employees.add(new Employee("Amanda White", 80000));
    Employees.add(new Worker("Jill Doe", 8200, "random position 2"));

    // Adding 7 new employees
    Employees.add(new Manager("Maxim Green", 5060, 0));
    Employees.add(new Worker("John Doe2", 5060, "random position 3"));
    Employees.add(new Worker("Alex Brown2", 60300, "random position 4"));
    Employees.add(new Worker("Henry Max2", 7500, "random position 5"));
    Employees.add(new Worker("Amanda White2", 80000, "random position 6"));
    Employees.add(new Worker("Jill Doe2", 8200, "random position 7"));
    Employees.add(new Worker("John Do2e", 5060, "random position 8"));

    // count number of non Mangager employees
    int count = 0;
    for (Employee employee : Employees) {
      if (!(employee instanceof Manager)) {
        count++;
      }
    }

    // ! Pozostałość z zadania 1.
    System.out.println(Employees.get(3).toString());
    Employees.get(3).setSalary(356000);

    // this increasess salary of all employees by 500
    for (Employee employee : Employees) {
      employee.setSalary(employee.getSalary() + 500);
    }

    for (Employee employee : Employees) {
      if ((employee instanceof Manager)) {
        ((Manager) employee).setNumberOfSubordinates(count);
        employee.setSalary(7500);
      }
    }

    System.out.println("--------------------------------");

    for (Employee employee : Employees) {
      System.out.println(employee.toString());
    }

  }
}
