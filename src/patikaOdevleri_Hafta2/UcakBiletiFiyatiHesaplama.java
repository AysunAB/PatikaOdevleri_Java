package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

   /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
    yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
     Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    İpucu
    Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
    Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
    İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
    Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
    Toplam Tutar = (135-27)* 2 = 216 TL
    Mesafeyi km türünden giriniz : 1500
    Yaşınızı giriniz : 20
    Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

    Toplam Tutar = 216 TL
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// Kullanicidan mesafe, yas ve ucus tipi bilgileri alinir ve variablelara atanir
        System.out.println("Mesafeyi km türünden giriniz");
        int km=scan.nextInt();
        double fligtDiscount=km*0.10;
        System.out.println("Yasinizi giriniz");
        int age=scan.nextInt();
        double ageDiscount;
        System.out.println("Yolculuk yonunu giriniz : ");
        System.out.println("1 => Tek Yön\n2 => Gidis-Donus");
        int type = scan.nextInt();

        if ((km > 0) && (age > 0) && (type == 1 || type == 2)) { //Kullanicinin mesafe ve yasi 0 dan buyuk,
                                                                 // ucus tipinide 1 veya 2 olarak secmesi kosulu saglanir

        if (age<12){
            ageDiscount=fligtDiscount*0.5;                     // Kisi 12 yasindan küçükse bilet fiyati uzerinden %50 indirim uygulanir.
        }
        else if (age>=12 && age<=24) {                         //Kisi 12-24 yaslari arasında ise bilet fiyati uzerinden %10 indirim uygulanir.
            ageDiscount = fligtDiscount * 0.1;
        } else if (age >= 65) {
            ageDiscount= fligtDiscount * 0.3;                  //Kişi 65 yaşsidan buyuk ise bilet fiyati uzerinden %30 indirim uygulanir.
        } else  {
            ageDiscount=0;                                     //bunlarin hicbiri degilse indirim uygulanmaz
        }

            double normalAmount = km * 0.10 ;                     //normal tutar icin mesafe 0.10 ile carpilir
            double	discountedPrice = normalAmount - ageDiscount ;  //indirimli tutar icin normal tutardan yas indirimi cikarilir
            double typeDiscount;                                    // ucus tipi tanimlanir
            double	flightPrice;                                    //ucus ucreti tanimlanir

            if (type==2) {                                           //Eger tip 2 ucus secilirse indirimli tutar 0.2 ile carpilarak,
                                                                     //indirimli tutardan cikarilir 2 ile carpilir
                typeDiscount = discountedPrice * 0.20 ;
                flightPrice = (discountedPrice - typeDiscount) * 2 ;

            }else {                                                  //Eger tip 2 ucus secilirse indirim uygulanmaz

                flightPrice = discountedPrice;

            }

            System.out.println("Toplam tutar : " + flightPrice + " TL");  //toplam ucus ucreti konsola yazdirilir

    }



    }

}
