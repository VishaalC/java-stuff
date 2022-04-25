package com.company;

import java.util.Scanner;

public class MultiThread {
    public static void main(String args[]) {
        Account t1 = new Account(5000);
        Account t2 = new Account(6000);
        Account t3 = new Account(7000);

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        t3.start();
        try {
            t3.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Account extends Thread{
    int bal;

    public void run() {
        System.out.println("Initializing");
        Withdraw();
        Deposit();
        RemBal();
    }

    Account(int x){
        this.bal = x;
    }

    void Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount to withdraw");
        int wDraw = sc.nextInt();

        if (wDraw < bal) {
            bal -= wDraw;
        }
        else {
            System.out.println("Insufficient Funds!");
        }
    }

    void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an amount to deposit");
        int Dep = sc.nextInt();

        bal += Dep;
    }

    void RemBal() {
        System.out.println("The remaining balance in the account is "+bal);
    }
}
