//  Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID."
//  Include a method to calculate the employee's yearly salary and a method to print the employee's name and salary.
package com.bridgelabz;
import java.util.Scanner;
public class Employee {
    int sal,id,total_sal;
    String name;
    public void sal(int sal){
        // sal = 1 month
        //total sal is 12 month
        total_sal=sal*12;

    }
    public void display(){
        System.out.println("name of the employee is " +name);
        System.out.println("total sal of the employee is " +total_sal);
        System.out.println("id of the employee is "+id);

    }
    public static void main(String[] args) {
        Employee e= new Employee();
    Scanner sc = new Scanner(System.in);
        System.out.println("ENter name of the emp:");
        e.name=sc.next();
        System.out.println("Enter salary of the emp:");
        e.sal=sc.nextInt();
        System.out.println("Enter Id of the employee:");
        e.id=sc.nextInt();
        e.sal(e.sal);
        e.display();
    }
}
