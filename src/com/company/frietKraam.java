package com.company;

public class frietKraam extends Voedselkraampjes{

    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public frietKraam(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Friet: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }
}
