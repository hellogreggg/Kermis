package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Kermis kermis = new Kermis();

    }
}

class  Kermis {

    boolean enterKermis = true;



    public Kermis(){
        KERMIS:
        while (enterKermis) {
            System.out.println("Welkom bij de Kermis");
            Attractie attractie = new Attractie();
            attractie.keuzen();
            attractie.selected();
            break;
        }
    }

}

class Attractie  extends  Kermis{

    private static double TotalIncome;
    int keuze;

    public Attractie(){

    }

     public Attractie(double TotalIncome){
        this.TotalIncome = TotalIncome;

    }


    public void keuzen() {
        Scanner sc = new Scanner(System.in);
        int keuze;
        System.out.println("Kies een attractie, de keuzen zijn: ");
        System.out.println("1 = Reuzenrad, 2 = Draaimolen, 3 = Botsauto's, 4 = Spiegel Paleis, 5 = Spookhuis, 6 = Klimmuur");
        keuze = sc.nextInt();
        this.keuze = keuze;

    }

    public void selected (){
        if (keuze == 1) {
            System.out.println("Je hebt voor de Reuzenrad gekozen");
            Reuzenrad reuzenrad = new Reuzenrad();
            System.out.println("De Reuzenrad kost: " + reuzenrad.getPrijs() + " Euro");
        } else if (keuze == 2) {
            System.out.println("Je hebt voor de Draaimolen gekozon");
            Draaimolen draaimolen = new Draaimolen();
            System.out.println("De Draaimolen kost: " + draaimolen.getPrijs() + " Euro");
        } else if (keuze == 3) {
            System.out.println("Je hebt voor de Botsauto's gekozen");
            Botsautos botsautos = new Botsautos();
            System.out.println("De Botsauto's kost: " + botsautos.getPrijs() + " Euro");
        } else if (keuze == 4) {
            System.out.println("Je hebt voor het Spiegel Paleis gekozon");
            Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
            System.out.println("De Spiegel Paleis kost: " + spiegelpaleis.getPrijs() + " Euro");
        } else if (keuze == 5) {
            System.out.println("Je hebt voor het Spookhuis gekozen");
            Spookhuis spookhuis = new Spookhuis();
            System.out.println("De Spookhuis kost: " + spookhuis.getPrijs() + " Euro");
        } else if (keuze == 6) {
            System.out.println("Je hebt voor het Klimmuur gekozen");
            Klimmuur klimmuur = new Klimmuur();
            System.out.println("De Klimmuur kost: " + klimmuur.getPrijs() + " Euro");
        } else {
            System.out.println("Choose Again");
            keuzen();
        }
    }
}

class Reuzenrad extends Attractie {
    private double prijs = 3.50;
    public void setPrijs(double prijs){

        this.prijs = prijs;
    }

    public double getPrijs(){

        return prijs;
    }

}

class Draaimolen extends Attractie {
    private double prijs = 2.00;
    public void setPrijs(double prijs){

        this.prijs = prijs;
    }

    public double getPrijs(){
        return prijs;
    }


}

class Botsautos extends Attractie {
    private double prijs = 1.50;
    private double totalIncome;
    public int tickets;

    public void setPrijs(double prijs){

        this.prijs = prijs;
    }

    public double getPrijs(){

        return prijs;
    }

    public void setTotalIncome(double totalIncome){

    }




}

class Spiegelpaleis extends Attractie {
    private double prijs = 1.00;
    public void setPrijs(double prijs){

        this.prijs = prijs;
    }

    public double getPrijs(){
        return prijs;
    }


}

class Spookhuis extends  Attractie {
    private double prijs = 3.00;
    public void setPrijs(double prijs){
        this.prijs = prijs;
    }

    public double getPrijs(){
        return prijs;
    }


}

class Klimmuur extends  Attractie {
    private double prijs = 4.00;
    public void setPrijs(double prijs){
        this.prijs = prijs;
    }

    public double getPrijs(){
        return prijs;
    }


}

