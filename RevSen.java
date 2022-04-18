package com.company;

public class RevSen {
    public static void Reversing(String s)
    {
        String[] split = s.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + " ");
        }
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        RevSen ob = new RevSen();
        ob.Reversing("Hello I am");
    }
}
