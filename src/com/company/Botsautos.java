package com.company;

public class Botsautos extends Attractie implements Draaien{
    public static double prijs;

    private static double totalIncome;
    private static int totalSold;


    public Botsautos(double prijs){
        this.prijs = prijs;
        this.totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Bots autos: " + prijs + " Euro");
        Botsautos.totalSold++;
        draaien();
        kaarjtes();
    }

    @Override
    public void draaien() {
        System.out.println("Draaien gaat van start");
    }

    public int getTotalSold(){
        return totalSold;

    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void kaarjtes(){
        System.out.println(getTotalSold() + " Bots Auto kaatjes verkocht ");
        System.out.println(getTotalIncome() + " aan de Bots Autos verdiend");
    }
}


