//Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID."
// Include a method to print the name and age of the student.
package com.bridgelabz;
import java.util.Scanner;
public class student {
int age,id;
String name;
    public void display(int id, int age,String name){
        System.out.println("Name of the student is "+name);
        System.out.println("Id of the student is "+id);
        System.out.println("Age of the student is "+age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student();
        System.out.println("ENter the name of the student:-");
        s.name=sc.next();
        System.out.println("ENter age of the student:-");
        s.age=sc.nextInt();
        System.out.println("Enter id of the student : - ");
        s.id=sc.nextInt();
        s.display(s.id,s.age,s.name);
    }
}
