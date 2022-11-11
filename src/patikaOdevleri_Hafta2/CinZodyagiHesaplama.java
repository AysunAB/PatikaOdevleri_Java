package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class CinZodyagiHesaplama {

   /* Çin Zodyağı nedir?

    4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç
    ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı
    bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

    Çin Zodyağı nasıl hesaplanır?

    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun

    Doğum Tarihi %12 = 1 ➜ Horoz

    Doğum Tarihi %12 = 2 ➜ Köpek

    Doğum Tarihi %12 = 3 ➜ Domuz

    Doğum Tarihi %12 = 4 ➜ Fare

    Doğum Tarihi %12 = 5 ➜ Öküz

    Doğum Tarihi %12 = 6 ➜ Kaplan

    Doğum Tarihi %12 = 7 ➜ Tavşan

    Doğum Tarihi %12 = 8 ➜ Ejderha

    Doğum Tarihi %12 = 9 ➜ Yılan

    Doğum Tarihi %12 = 10 ➜ At

    Doğum Tarihi %12 = 11 ➜ Koyun

            Senaryo

    Doğum Yılınızı Giriniz : 1990
    Çin Zodyağı Burcunuz : At*/

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz : ");
        int year=scan.nextInt();
        int chineseZodiac=year%12;


        switch(chineseZodiac){

           case 0:
               System.out.println("Cin zodyak burcunuz : "+"maymun");
               break;
            case 1:
                System.out.println("Cin zodyak burcunuz : "+"Horoz");
                break;
            case 2:
                System.out.println("Cin zodyak burcunuz : "+"Kopek");
                break;
            case 3:
                System.out.println("Cin zodyak burcunuz : "+"Domuz");
                break;
            case 4:
                System.out.println("Cin zodyak burcunuz : "+"Fare");
                break;
            case 5:
                System.out.println("Cin zodyak burcunuz : "+"Okuz");
                break;
            case 6:
                System.out.println("Cin zodyak burcunuz : "+"Kaplan");
                break;
            case 7:
                System.out.println("Cin zodyak burcunuz : "+"Tavsan");
                break;
            case 8:
                System.out.println("Cin zodyak burcunuz : "+"Ejderha");
                break;
            case 9:
                System.out.println("Cin zodyak burcunuz : "+"Yilan");
                break;
            case 10:
                System.out.println("Cin zodyak burcunuz : "+"At");
                break;
            case 11:
                System.out.println("Cin zodyak burcunuz : "+"Koyun");
                break;
           default:
               System.out.println("Yanlis giris yaptiniz");
        }


    }


}
