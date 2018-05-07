package com.company;

import java.util.Scanner;

public class  Kermis {

    private static float kermisOmzet;
    private static int kermisAankopen;

    private float getKermisOmzet(){
        return  kermisOmzet;
    }

    public int getkermisAankopen(){
        return kermisAankopen;
    }





    public void start(){

            boolean enterKermis = true;
            int keuze;

            System.out.println("Welkom bij de Kermis");
            Scanner sc = new Scanner(System.in);

            while(enterKermis){
                System.out.println("Wat wilt u doen, de keuzen zijn: ");
                System.out.println("1 = Voedsel Kraamjes, 2 = Atrracties, 3 = Omzet, 4 = Kaartjes, 5 = Weggaan");
                keuze = sc.nextInt();
                if (keuze == 1){
                    Voedselkraampjes voedselkraampjes = new Voedselkraampjes();
                    voedselkraampjes.keuzen();
                }
                else if (keuze == 2){
                    Attractie attractie = new Attractie();
                    attractie.keuzen();
                } else if (keuze == 3){
                    kermisOmzet = (float)(Voedselkraampjes.totalIncome + Attractie.totalIncome);
                    System.out.println("Kermis totale omzet is " + getKermisOmzet() + " euro");
                }else if (keuze == 4){
                    kermisAankopen = Voedselkraampjes.totalSold +  Attractie.totalSold;
                    System.out.println("Totale Kermis aankopen zijn : " + getkermisAankopen() + " Aankopen");
                } else if (keuze == 5) {
                    System.out.println("Tot Ziens");
                    break;
                } else {
                    break;
                }

            }


    }
}
