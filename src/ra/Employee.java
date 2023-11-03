package ra;

import java.util.Scanner;

public class Employee {
    private int employeeId,age;
    private String employeeName;
    private boolean gen;
    private  double rate,salary;

    public Employee() {
    }

    public Employee(int employeeId, int age, String employeeName, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.age = age;
        this.employeeName = employeeName;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public  void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        this.employeeId  = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        this.employeeName = sc.nextLine();
        System.out.println("Nhập tuổi");
        this.age  = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính (true/false)");
        this.gen = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập hệ số lương");
        this.rate  = Double.parseDouble(sc.nextLine());
    }
    public void calSalary(){
        this.salary = this.rate*1300000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", age=" + age +
                ", employeeName='" + employeeName + '\'' +
                ", gen=" + (gen?"Nam":"Nữ") +
                ", rate=" + rate +
                ", salary=" + salary +
                '}';
    }

    public void displayData(){
        System.out.println(this);
    }
}
