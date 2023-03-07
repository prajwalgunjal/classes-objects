//    Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber."
//    Include a method to deposit money into the account and a method to withdraw money from the account.
package com.bridgelabz;
import java.util.Scanner;
public class BankAccount {
    int balance,accno,currentbal=50000;
    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the amout :- ");
        int depoamount=sc.nextInt();
        currentbal=currentbal+depoamount;
        System.out.println("Your current balance is "+currentbal);

    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the amout :- ");
        int withdrawAmount=sc.nextInt();
        currentbal=currentbal-withdrawAmount;
        System.out.println("your current balance is " +currentbal);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want \t 1) deposit \t2) withdraw");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1: {
                b.deposit();
                break;
            }
            case 2:
            {
                b.withdraw();
                break;
            }
        }
    }
}
