package org.example;

public class Laptop {
    //This is a class

    public int numberOfCores;

    public boolean isOne;

    public String name;

    public Laptop(int numberOfCoresIn, boolean isOneIn, String nameIn){
        // The above is referred to a signature
        // The ones with "In" is what is being requested e.g. numberOfCoresIn
        // This is the constructor. (Same name as class)

      this.numberOfCores = numberOfCoresIn;
      this.isOne = isOneIn;
      this.name = nameIn;

    }

}
