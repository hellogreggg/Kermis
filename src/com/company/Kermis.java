package com.company;

import java.util.Scanner;

public class  Kermis {

    boolean enterKermis = true;
    String keuze;



    public Kermis(){

        while (enterKermis) {
            System.out.println("Welkom bij de Kermis");
            Scanner sc = new Scanner(System.in);
            String keuze;
            System.out.println("Wat wilt u doen, de keuzen zijn: ");
            System.out.println("1 = Voedsel Kraamjes, 2 = Atrracties, o = Omzet, K = Kaartjes" );
            keuze = sc.next();
            this.keuze = keuze;
            System.out.println(keuze);
        }
    }

}
