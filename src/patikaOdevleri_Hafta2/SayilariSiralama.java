package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class SayilariSiralama {

   /* Odev
    Girilen 3 sayiyi "küçükten büyüge" sıralayan programı yaziniz.*/

    public static void main(String[] args) {

        double number1, number2, number3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        number1 = scan.nextDouble();
        System.out.println("Lutfen farkli bir sayi giriniz");
        number2 = scan.nextDouble();
        System.out.println("Lutfen farkli bir sayi giriniz");
        number3 = scan.nextDouble();



        if ((number1 > number2 && number1 > number3)) {

            if (number2 > number3) {

                System.out.print(number1+">"+number2+">"+number3);

            } else {
                System.out.print(number1+">"+number3+">"+number2);
            }

        } else if (number2 > number1 && number2 > number3) {

            if (number1 > number3) {

                System.out.print(number2+">"+number1+">"+number3);

            } else {

                System.out.print(number2+">"+number3+">"+number1);
            }

        } else if (number3 > number1 && number3 > number2) {

            if (number2 > number1) {
                System.out.print(number3+">"+number2+">"+number1);

            } else {
                System.out.print(number3+">"+number1+">"+number2);
            }

        }
    }
}