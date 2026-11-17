package week6;

import java.util.Scanner;


public class week6day2Act {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegularEmployee e = new RegularEmployee(null, 0);
        
        System.out.println("===== EMPLOYEE SALARY SYSTEM =====\n");
        System.out.print("Employee name: ");
        String name = sc.nextLine();
        e.setName(name);
        
        System.out.print("Basic salary: ");
        int salary = sc.nextInt();
        e.setSalary(salary);
        

        System.out.println("\n===== EMPLOYEE INFORMATION =====\n");
        
        System.out.println("Employee name: "+e.getName());
        System.out.println("basic salary: "+e.getSalary());
        System.out.println("Total Salary: "+e.calculateSalary());
    }
}

class Employee {
    protected String name;
    protected int basicSalary;

    public Employee(String name, int basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void setName(String setName) {
        name = setName;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int setSalary) {
        basicSalary = setSalary;
    }

    public int getSalary() {
        return basicSalary;
    }
}

class RegularEmployee extends Employee {

    public RegularEmployee(String name, int basicSalary) {
        super(name, basicSalary);
    }

    public int calculateSalary(){
        return this.basicSalary + 3000;
    }
}
