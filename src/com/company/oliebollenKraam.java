package com.company;

public class oliebollenKraam extends Voedselkraampjes {

    public static double prijs;

    private static double totalIncome;
    private static int totalSold;


    public oliebollenKraam(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Oliebollen: " + prijs + " Euro");
        oliebollenKraam.totalSold++;
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
