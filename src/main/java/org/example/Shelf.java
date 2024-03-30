package org.example;

public class Shelf {

    String material;

    public Shelf(String materialIn) {

        this.material = materialIn;

    }

    public static void main(String[] args) {
        Shelf bureau = new Shelf("pine");

        System.out.println(bureau.material);
    }
}