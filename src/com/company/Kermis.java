package com.company;

public class  Kermis {

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
