package com.company;

public class Klimmuur extends  Attractie {
    public static double prijs;

    private static double totalIncome;
    private static int totalSold;


    public Klimmuur(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Klimmuur: " + prijs + " Euro");
        Klimmuur.totalSold++;
        kaarjtes();
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
