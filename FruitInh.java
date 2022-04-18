package com.company;

public class FruitInh {
    String name, genus, SciName, status;

    public static void main(String[] args) {
        DragonFruit fruit = new DragonFruit();
        fruit.display();
    }
}

class DragonFruit extends FruitInh{
    DragonFruit() {
        name = "Dragon Fruit";
        genus = "Selenicereus";
        SciName = "Selenicereus undatus";
        status = "Damaged in transit";
    }

    void display() {
        System.out.println("Name: " + name + ", Genus: " + genus + ", Scientific name: " + SciName + ", status: " + status);
    }
}
