package com.company;

import java.util.Scanner;

public class EmpSal {
    int basicPay, HRA, DA, totalSal;
    String name;

    EmpSal(String n, int x, int y, int z) {
        name = n;
        basicPay = x;
        HRA = y;
        DA = z;
    }

    public void calSal() {
        HRA = (basicPay * HRA)/100;
        DA = (basicPay * DA)/100;
        totalSal = basicPay + HRA + DA;
    }

    public void display() {
        System.out.println(totalSal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee details: ");
        String name = sc.nextLine();
        int basicPay = sc.nextInt();
        int HRA = sc.nextInt();
        int DA = sc.nextInt();

        EmpSal empl1 = new EmpSal(name, basicPay, HRA, DA);
        empl1.calSal();
        empl1.display();
    }
}
