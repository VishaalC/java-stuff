package com.company;

interface vehicle1 {
    void carStart();
}
interface vehicle2 {
    void carStop();
}
public class MultVehicle implements vehicle1, vehicle2 {
    public void carStart() {
        System.out.println("Starting car..");
    }
    public void carStop() {
        System.out.println("Stopping car");
    }
    void carDetails(){
        System.out.println("Innova");
        System.out.println("Horsepower: 122");
    }

    public static void main(String[] args) {
        MultVehicle ob = new MultVehicle();
        ob.carStart();
        ob.carStop();
        ob.carDetails();
    }
}

