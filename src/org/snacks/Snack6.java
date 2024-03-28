package org.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        //Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Scrivi un numero di secondi");
        int number = keyboard.nextInt();

        int hour = number/3600;
        System.out.println(hour);

        int secondsRemaining = number % 3600;
        System.out.println(secondsRemaining);

        int min = secondsRemaining / 60;
        System.out.println(min);

        int second = secondsRemaining % 60;
        System.out.println(second);

        //%02d:%02d:%02d significa che il numero verrà formattato in modo che saranno presenti 2 cifre
        String dateFormatted = String.format("%02d:%02d:%02d", hour,min,second);

        System.out.println(dateFormatted);
    }
}
