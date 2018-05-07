package com.company;

public class Spookhuis extends  Attractie implements Draaien {

    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public Spookhuis(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Spookhuis: " + prijs + " Euro");
        draaien();
        System.out.println(totalIncome);
        System.out.println(totalSold);

    }

    @Override
    public void draaien() {
        System.out.println("Draaien gaat van start");
    }
}
