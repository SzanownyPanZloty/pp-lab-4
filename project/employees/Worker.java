package project.employees;

public class Worker extends Employee {
  public String position;

  public Worker(String fullName, double salary, String position) {
    super(fullName, salary);
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String toString() {
    return "Worker: " + this.getName() + " Salary: " + this.getSalary() + " Position: " + this.position;
  }
}