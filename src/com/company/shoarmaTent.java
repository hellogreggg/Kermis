package com.company;

public class shoarmaTent extends Voedselkraampjes {

    public static double prijs;

    private static double totalIncome;
    private static int totalSold;


    public shoarmaTent(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Shoarma: " + prijs + " Euro");
        shoarmaTent.totalSold++;
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
