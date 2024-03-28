package org.snacks;

import java.util.Arrays;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
/*Data in input una stringa verificare se è palindroma*/
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Verifica se palindroma");
        String str = keyboard.nextLine();
        //Conversione da stringa ad Array
        char[] strInArray = str.toCharArray();
        //for inverso
        for (int i = strInArray.length - 1; i >= 0 ; i--) {
            char reverseChar = strInArray[i];
            System.out.println(reverseChar);
        }
    }
}
