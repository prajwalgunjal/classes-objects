//Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
// Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and weight.
package com.bridgelabz;
import java.util.Scanner;

public class dog {
    String breed;
    int age,weight;

    public void calculateAge(){
        age=age*7;
        System.out.println("the dog's age in human years is "+age);
    }
    public void display(){
        System.out.println("Breed of the dog is : "+breed);
        System.out.println("Age of the dog is : "+age);
        System.out.println("weight of the dog is :"+weight);
    }
    public static void main(String[] args) {
        dog d = new dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breed");
        d.breed=sc.next();
        System.out.println("Enter age: ");
        d.age=sc.nextInt();
        System.out.println("Enter weight:- ");
        d.weight=sc.nextInt();
        d.calculateAge();
        d.display();
    }
}
