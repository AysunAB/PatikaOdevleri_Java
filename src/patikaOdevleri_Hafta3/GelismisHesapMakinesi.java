package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 1;


        while (true) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". sayı :");
                number = scan.nextInt();

                if (number == 1)
                    continue;

                if (number == 0) {
                    result = 0;
                    break;
                }
                result *= number;
            }

            System.out.println("Sonuç : " + result);
        }

    }
    static void divided(){


        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = sc.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("mod alinacak sayiyi giriniz değeri giriniz :");
        int number = scan.nextInt();
        System.out.print("mod degerini giriniz :");
        int modulus = scan.nextInt();
        int result=number % modulus;
        System.out.println("Sonuc:"+result);
    }
    static void  areaAndPer() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdortgenin kisa kenarinin uzunlugunu giriniz :");
        int a=scan.nextInt();
        System.out.print("Dikdortgenin uzun kenarinin uzunlugunu giriniz :");
        int b=scan.nextInt();
        int result1 = 2 * (a + b);
        int result2 = a * b;
        System.out.println("Cevre:" + result1);
        System.out.println("Alan:" + result2);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaAndPer();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
