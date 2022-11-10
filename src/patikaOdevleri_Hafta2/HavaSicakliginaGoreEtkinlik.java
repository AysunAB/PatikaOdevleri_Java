package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {

   /* Odev :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sicakligi giriniz");
        int heat= scan.nextInt();

        if (heat<5){
            System.out.println("kayak yapabilirsin");
        }
        else if (heat>=5 && heat<15){
            System.out.println("sinemaya gidebilirsin");
        }
        else if (heat>=15 && heat<25){
            System.out.println("piknige gidebilirsin");
        }
        else if (heat>=25) {
            System.out.println("yuzmeye gidebilirsin");
        }
    }
}
