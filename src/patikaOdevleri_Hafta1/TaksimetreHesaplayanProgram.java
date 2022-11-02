package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/

    /**
     *
     */
    public static void main(String[] args) {

        int yol,acilisUcreti=10;
        double kmBasina=2.20,toplamtutar;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gidilen yol mesafesini km olarak giriniz");
        yol=scan.nextInt();

        toplamtutar=(yol*kmBasina)+acilisUcreti;
        System.out.println("Toplam tutar : " + toplamtutar);

    }
}
