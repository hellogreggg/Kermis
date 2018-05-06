package com.company;

public class oliebollenKraam extends Voedselkraampjes {

    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public oliebollenKraam(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Oliebollen: " + prijs + " Euro");
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }

}
