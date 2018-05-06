package com.company;

import java.util.Scanner;

public class Attractie  extends  Kermis{

    public static double totalIncome;
    public static int totalSold;

     public void draaien(){
        System.out.println("de Attractie Draait");
    }


    public void keuzen() {
        Scanner sc = new Scanner(System.in);
        int keuze;
        System.out.println("Kies een attractie, de keuzen zijn: ");
        System.out.println("1 = Reuzenrad, 2 = Draaimolen, 3 = Botsauto's, 4 = Spiegel Paleis, 5 = Spookhuis, 6 = Klimmuur");
        keuze = sc.nextInt();

        if (keuze == 1) {
            System.out.println("Je hebt voor de Reuzenrad gekozen");
            Reuzenrad reuzenrad = new Reuzenrad(4.00);
            reuzenrad.run();
        } else if (keuze == 2) {
            System.out.println("Je hebt voor de Draaimolen gekozon");
            Draaimolen draaimolen = new Draaimolen(2.90);
            draaimolen.run();
        } else if (keuze == 3) {
            System.out.println("Je hebt voor de Botsauto's gekozen");
            Botsautos botsautos = new Botsautos(2.50);
            botsautos.run();
        } else if (keuze == 4) {
            System.out.println("Je hebt voor het Spiegel Paleis gekozon");
            Spiegelpaleis spiegelpaleis = new Spiegelpaleis(2.75);
            spiegelpaleis.run();
        } else if (keuze == 5) {
            System.out.println("Je hebt voor het Spookhuis gekozen");
            Spookhuis spookhuis = new Spookhuis(3.20);
            spookhuis.run();
        } else if (keuze == 6) {
            System.out.println("Je hebt voor het Klimmuur gekozen");
            Klimmuur klimmuur = new Klimmuur(5.00);
            klimmuur.run();
        } else {
            System.out.println("Choose Again");
            keuzen();
        }
    }
}
