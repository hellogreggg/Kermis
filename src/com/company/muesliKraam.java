package com.company;

public class muesliKraam extends Voedselkraampjes {

    public static double prijs;

    public static double totalIncome;
    public static int totalSold;


    public muesliKraam(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Musli: " + prijs + " Euro");
        muesliKraam.totalSold++;
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
