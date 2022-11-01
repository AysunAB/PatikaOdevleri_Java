package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class NotHesaplama_BasariDurumu {

    /*Not Ortalaması Hesaplayan Program
    Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
     ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
     Not : If ve Else kullanılmayacak...

    /**
     * @author aysun
     */
    public static void main(String[] args) {


        int matematik, fizik, kimya, turkce, tarih, muzik;//Variable'lar tanimlanir

        Scanner scan = new Scanner(System.in);//scan objesi olusturulur

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;//ortalama hesaplanir
        System.out.println("Sinav sonucu : " + ortalama);//konsolda yazdirilir
        System.out.print(ortalama > 60 ? "Basarili oldunuz" : "Basarisiz oldunuz");//konsolda yazdirilir
    }
}