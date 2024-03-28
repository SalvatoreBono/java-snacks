package org.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci un numero pari tra 10 e 20");
        int numberUser = keyboard.nextInt();
        while ( numberUser < 10 || numberUser > 20 || numberUser % 2 != 0){
            System.out.println("Inserisci un numero pari tra 10 e 20");
            numberUser = keyboard.nextInt();
        }
        System.out.println("Hai inserito un numero valido");
        keyboard.close();
    }
}
