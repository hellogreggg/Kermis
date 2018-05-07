package com.company;

public class Draaimolen extends Attractie implements Draaien{
    public static double prijs;

    private static double totalIncome;
    private static int totalSold;


    public Draaimolen(double prijs){
        this.prijs = prijs;
        totalIncome += prijs;
        Voedselkraampjes.totalIncome += prijs;
        Voedselkraampjes.totalSold++;
    }


    public void run() {
        System.out.println("Draaimolen: " + prijs + " Euro");
        Draaimolen.totalSold++;
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
