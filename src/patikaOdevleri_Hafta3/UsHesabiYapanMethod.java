package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class UsHesabiYapanMethod {

    /*Recursive Metotlar ile Üslü Sayı Hesaplama
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

            Senaryo

    Taban değeri giriniz :2
    Üs değerini giriniz : 0
    Sonuç : 1
    Taban değeri giriniz : 2
    Üs değerini giriniz : 3
    Sonuç : 8
    Taban değeri giriniz : 5
    Üs değerini giriniz : 3
    Sonuç : 125*/

    static int i, temp, exponent,result=1;

    public static void main(String[] args) {

        System.out.println("Sonuc : "+usHesaplama(temp));
    }


    static int usHesaplama(int x) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Taban degerini giriniz");
        temp=scan.nextInt();
        System.out.println("Us degerini giriniz");
        exponent=scan.nextInt();


            for (i = 0; i < exponent; i++) {
                result*= temp;
            }

        return result;
    }
}