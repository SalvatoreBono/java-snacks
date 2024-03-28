package org.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        Scanner keyboard = new Scanner(System.in);

        int counterNumbers= 0, counterCharacter = 0, counterSymbols= 0;

        System.out.println("Scrivi una stringa");
        String str = keyboard.nextLine();

        char[] stringToArray = str.toCharArray();

        for (int i = 0; i < stringToArray.length; i++) {
            //Verifica se è una lettera
            if (Character.isAlphabetic(stringToArray[i])){
                counterCharacter++;
                //Verifica se è un numero
            } else if (Character.isDigit(stringToArray[i])) {
                counterNumbers++;
            } else {
                counterSymbols++;
            }
        }
        System.out.println("Sono presenti "+ counterCharacter + " caratteri");
        System.out.println("Sono presenti "+ counterNumbers + " numeri");
        System.out.println("Sono presenti "+ counterSymbols + " simboli");
    }
}
