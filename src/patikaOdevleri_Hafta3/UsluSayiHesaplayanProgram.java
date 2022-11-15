package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {

    // Odev
    // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

    public static void main(String[] args) {

        int number, exponent, i;


        Scanner scan = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        number = scan.nextInt();
        System.out.print("Ussunu giriniz: ");
        exponent = scan.nextInt();
        int result = 1;

        for (i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println("Sonuc= " + result);
    }
}