package com.company;

public class muesliKraam extends Voedselkraampjes {

    public static double prijs;

    public double totalIncome;
    public int totalSold;


    public muesliKraam(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Musli: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }
}
