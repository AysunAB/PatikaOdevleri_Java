package patikaOdevleri_Hafta2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BurcHesaplama {

        /*Koç Burcu : 21 Mart - 20 Nisan

         Boğa Burcu : 21 Nisan - 21 Mayıs

         İkizler Burcu : 22 Mayıs - 22 Haziran

         Yengeç Burcu : 23 Haziran - 22 Temmuz

         Aslan Burcu : 23 Temmuz - 22 Ağustos

         Başak Burcu : 23 Ağustos - 22 Eylül

         Terazi Burcu : 23 Eylül - 22 Ekim

         Akrep Burcu : 23 Ekim - 21 Kasım

         Yay Burcu : 22 Kasım - 21 Aralık

         Oğlak Burcu : 22 Aralık - 21 Ocak

         Kova Burcu : 22 Ocak - 19 Şubat

         Balık Burcu : 20 Şubat - 20 Mart

         Ödev
         Aynı örneği switch-case kullanmadan yapınız.*/

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kacinci ayda dogdugunuzu giriniz: ");
        int month = scan.nextInt();

        System.out.println("Ayin kacinci gununde dogdugunuzu giriniz: ");
        int day = scan.nextInt();

        if (month > 0 && month <= 12 && day > 0) {
            if (month == 1 && day <= 22) {
                System.out.println("Oglak burcusunuz");
            } else if (month == 1 && day > 22 && day >= 31) {
                System.out.println("Kova Burcusunuz");

            }
        }
        if (month == 2) {
            if (day <= 19) {
                System.out.println("Kova Burcu");
            } else if (day <= 30) {
                System.out.println("Balık Burcu");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 3) {
            if (day < 20) {
                System.out.println("Balik Burcu");
            } else if (day <= 31) {
                System.out.println("Koc Burcu");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 4) {
            if (day < 20) {
                System.out.println("Koc Burcusunuz");
            } else if (day <= 30) {
                System.out.println("Boga Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 5) {
            if (day < 21) {
                System.out.println("Boga Burcusunuz");
            } else if (day <= 31) {
                System.out.println("İkizler Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 6) {
            if (day < 22) {
                System.out.println("İkizler Burcusunuz");
            } else if (day <= 30) {
                System.out.println("Yengec Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 7) {
            if (day < 22) {
                System.out.println("Yengec Burcusunuz");
            } else if (day <= 31) {
                System.out.println("Aslan Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 8) {
            if (day < 22) {
                System.out.println("Aslan Burcusunuz");
            } else if (day <= 31) {
                System.out.println("Basak Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 9) {
            if (day < 22) {
                System.out.println("Basak Burcusunuz");
            } else if (day <= 30) {
                System.out.println("Terazi Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 10) {
            if (day < 22) {
                System.out.println("Terazi Burcusunuz");
            } else if (day <= 31) {
                System.out.println("Akrep Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 11) {
            if (day < 21) {
                System.out.println("Akrep Burcusunuz");
            } else if (day <= 30) {
                System.out.println("Yay Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }
        }
        if (month == 12) {
            if (day < 21) {
                System.out.println("Yay Burcusunuz");
            } else if (day <= 31) {
                System.out.println("Oglak Burcusunuz");
            } else {
                System.out.println("Hatali Giris yaptiniz,tekrar giriniz");
            }


        }
    }
}




