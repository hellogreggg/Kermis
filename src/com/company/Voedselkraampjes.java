package com.company;

import java.util.Scanner;

public class Voedselkraampjes extends Kermis {

    public static double totalIncome;
    public static int totalSold;


    public void keuzen() {
        Scanner sc = new Scanner(System.in);
        int keuze;
        System.out.println("Wat wil je eten, de keuzen zijn: ");
        System.out.println("1 = Friet Kraam, 2 = Museli Kraam, 3 = Oliebollen Kraam, 4 = Shoarma Tent");
        keuze = sc.nextInt();

        if (keuze == 1) {
            System.out.println("Lekker Friet");
            frietKraam frietKraam = new frietKraam(3.45);
            frietKraam.run();
        } else if (keuze == 2) {
            System.out.println("Lekker Museli");
            muesliKraam muesliKraam = new muesliKraam(9.00);
            muesliKraam.run();
        } else if (keuze == 3) {
            System.out.println("Lekker Oliebollen");
            oliebollenKraam oliebollenKraam = new oliebollenKraam(4.00);
            oliebollenKraam.run();
        } else if (keuze == 4) {
            System.out.println("Lekker Shoarma");
            shoarmaTent shoarmaTent = new shoarmaTent(5.15);
            shoarmaTent.run();

        } else {
            System.out.println("Choose Again");
            keuzen();
        }
    }



}

