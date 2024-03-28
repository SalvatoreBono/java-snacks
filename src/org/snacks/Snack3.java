package org.snacks;

public class Snack3 {
    public static void main(String[] args) {
    /*Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0){
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
