package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        /*Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste
        vuole mostrare a video una falsa lista di invitati con nome e cognome.*/

        String[] names= {"Salvatore","Vito","Francesco","Pietro","Marco","Andrea"};
        String[] surnames= {"Bono","Leone","Linza","La Bua","Collura","Isabelli"};
        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
            int randomNumberForName = random.nextInt(names.length);
            int randomNumberForSurname = random.nextInt(surnames.length);
            String randomName = names[randomNumberForName];
            String randomSurname = surnames[randomNumberForSurname];

            System.out.println(randomName + " " + randomSurname);

        }
    }
}
