package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class SinifGecme {
    /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

    Geçme Notu : 55

    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

    public static void main(String[] args) {


        int math, physics, chemical, turkish, history, music,total;
        double avarage;


        Scanner scan = new Scanner(System.in);


        System.out.print("Matemetik notunuz : ");
        math = scan.nextInt();

        System.out.print("Fizik notunuz : ");
        physics = scan.nextInt();

        System.out.print("Kimya notunuz : ");
        chemical = scan.nextInt();

        System.out.print("Turkce notonuz : ");
        turkish = scan.nextInt();

        System.out.print("Tarih notunuz : ");
        history = scan.nextInt();

        System.out.print("Muzik notunuz : ");
        music = scan.nextInt();

        if (math>=0 && math<=100 && physics>=0 && physics<=100 && chemical>=0 && chemical<=100 &&
            turkish>=0 && turkish<=100 && history>=0 && history<=100 && music>=0 && music<=100) {

            total = (math + physics + chemical + turkish + music + history);
            avarage = total / 6;
            System.out.println("Ortalama :" + avarage);
            if (avarage >= 55) {
                System.out.println("Sinifi gectiniz");
            } else System.out.println("Sinifi gecemediniz");

        }else System.out.println("notunuzu kontrol ediniz");
    }
    }

