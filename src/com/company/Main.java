package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }
}

class  Kermis {


}

class Attractie  extends  Kermis{

    public void Keuzen() {
        Scanner sc = new Scanner(System.in);
        String keuze = sc.nextLine();
        System.out.println(keuze);
        if (keuze == 1){

        } else if (keuze == 2){

        }
    }
}

class Reuzenrad extends Attractie {

        void gekozen(){
            System.out.println("You chose Reuzenrad ");
        }
}

class Draaimolen extends Attractie {

    void gekozen(){
        System.out.println("You chose Reuzenrad ");
    }

}

class Botsautos extends Attractie {

    void gekozen(){
        System.out.println("You chose Reuzenrad ");
    }

}

class Spiegelpaleis extends Attractie {
    void gekozen(){
        System.out.println("You chose Reuzenrad ");
    }

}

class Spookhuis extends  Attractie {
    void gekozen(){
        System.out.println("You chose Reuzenrad ");
    }

}

class Klimmuur extends  Attractie {
    void gekozen(){
        System.out.println("You chose Reuzenrad ");
    }

}

