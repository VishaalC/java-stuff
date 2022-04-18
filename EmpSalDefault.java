package com.company;

import java.util.Scanner;


public class EmpSalDefault {
    int basicPay, HRA, DA, totalSal;
    String name, nameVar;

    EmpSalDefault() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        basicPay = sc.nextInt();
        HRA = sc.nextInt();
        DA = sc.nextInt();
    }

    void calSal() {
        HRA = (basicPay * HRA)/100;
        DA = (basicPay * DA)/100;
        totalSal = basicPay + HRA + DA;
    }

    void display() {
        System.out.println(name);
        System.out.println(totalSal);
    }

    public static void main(String[] args)
    {
        EmpSalDefault emp1 = new EmpSalDefault();
        emp1.calSal();
        emp1.display();
    }
}
