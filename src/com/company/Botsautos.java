package com.company;

public class Botsautos extends Attractie {
    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public Botsautos(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Bots autos: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }
}


