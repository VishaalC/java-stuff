package com.company;

public class MultiLevel {
    int x, y, z;

    public  static void main(String[] args) {
        BaseClass1 ob = new BaseClass1();
        BaseClass2 ob2 = new BaseClass2();

        System.out.println("Baseclass2's attributes: ");
        System.out.println("x: " +ob2.x);
        System.out.println("y: " +ob2.y);
        System.out.println("z: " +ob2.z);

        System.out.println("Baseclass1's attributes: ");
        System.out.println("x: " +ob.x);
        System.out.println("y: " +ob.y);
        System.out.println("z: " +ob.z);
    }
}

class BaseClass1 extends MultiLevel {
    BaseClass1() {
        x = 5;
        y = 6;
        z = 7;
    }
}

class BaseClass2 extends BaseClass1 {
    BaseClass2() {
        x = 9;
        y = 2;
        z = 0;
    }
}


