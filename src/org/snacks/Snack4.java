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
        String reverseStr= "";
        //for inverso
        for (int i = strInArray.length - 1; i >= 0 ; i--) {
            char reverseChar = strInArray[i];
            //contatenamento
            reverseStr += reverseChar;
        }
        if (reverseStr.equals(str)){
            System.out.println("la parola scritta è palindroma");
        }else {
            System.out.println("la parola non è palindroma");
        }
    }
}
