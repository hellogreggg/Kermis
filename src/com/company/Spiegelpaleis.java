package com.company;

public class Spiegelpaleis extends Attractie {

    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public Spiegelpaleis(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Spiegel Paleis: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }


}
