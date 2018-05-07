package com.company;

public class Draaimolen extends Attractie implements Draaien{
    public static double prijs;

    private double totalIncome;
    private int totalSold;


    public Draaimolen(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        ++totalSold;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Draaimolen: " + prijs + " Euro");
        draaien();
        System.out.println(totalIncome);
        System.out.println(totalSold);
    }

    @Override
    public void draaien() {
        System.out.println("Draaien gaat van start");
    }
}
