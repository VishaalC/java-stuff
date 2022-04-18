package com.company;

public class HeirCar {
    String Name;
    int PayLoad;
    int mileage;
    int horsepower;

    void display() {
        System.out.println(Name);
        System.out.println(mileage);
        System.out.println(horsepower);
        System.out.println(PayLoad);
    }

    public static void main(String[] args) {
        InnovaCrystal car1 = new InnovaCrystal();
        Venue car2 = new Venue();
        car1.display();
        car2.display();
    }
}

class InnovaCrystal extends HeirCar{
    InnovaCrystal() {
        Name = "Toyota Innova Crystal";
        mileage = 16;
        horsepower = 122;
        PayLoad = 610;
    }
}

class Venue extends HeirCar {
    Venue() {
        Name = "Hyundai Venue";
        PayLoad = 389;
        mileage = 23;
        horsepower = 88;
    }
}
