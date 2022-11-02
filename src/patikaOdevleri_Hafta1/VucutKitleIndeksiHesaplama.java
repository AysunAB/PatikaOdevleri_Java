package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)

    Çıktısı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173*/

    /**
     * @author aysun
     */
    public static void main(String[] args) {

        double kilo,boy,kitleIndeksi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy= scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= scan.nextDouble();
        kitleIndeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+kitleIndeksi);

    }


}
