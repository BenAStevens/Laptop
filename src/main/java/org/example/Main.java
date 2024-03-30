package org.example;

public class Main {
    public static void main(String[] args) {

        Laptop HP = new Laptop(4,true,"Pro Book");

        Laptop Dell = new Laptop(2, false,"The Emily Basic Book");
        // This is use writing down on paper what type of laptop we want
        // when you use the new keyword is runs the constructor

        System.out.println("Your laptop has " + HP.numberOfCores + " cores." + " Is your laptop on?: " + HP.isOne + "." + " The name of your device is called: " + HP.name + ".");
    }
}