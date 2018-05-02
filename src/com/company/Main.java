package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kermis kermis = new Kermis();
        
    }
}

class  Kermis {


}

class Attractie  extends  Kermis{

    public void Keuzen() {
        Scanner sc = new Scanner(System.in);
        String keuze = sc.nextLine();
        System.out.println(keuze);
    }
}

class Reuzenrad extends Attractie {

}

class Draaimolen extends Attractie {

}

class Botsautos extends Attractie {

}

class Spiegelpaleis extends Attractie {

}

class Spookhuis extends  Attractie {

}

class Klimmuur extends  Attractie {

}

