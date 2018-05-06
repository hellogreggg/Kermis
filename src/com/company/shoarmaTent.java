package com.company;

public class shoarmaTent extends Voedselkraampjes {

    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public shoarmaTent(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Shoarma: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }
}
