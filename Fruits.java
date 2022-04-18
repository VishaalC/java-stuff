package com.company;

public class Fruits {
    String name;
    String status;
    String genus;
    public void Status() {
        System.out.println(status);
    }

    public static void main(String[] args)
    {
        Mango ob = new Mango();
        System.out.println(ob.name);
        ob.Status();
        System.out.println(ob.genus);


        Apple ob2 = new Apple();
        System.out.println(ob2.name);
        ob2.Status();
        System.out.println(ob2.genus);

    }
}

class Mango extends Fruits{
    public Mango()
    {
        name = "Mango";
        status = "Healthy";
        genus = "Mangifera";
    }
}

class Apple extends Fruits {
    public Apple()
    {
        name = "Apple";
        status = "Rotten";
        genus = "Malus";
    }
}
