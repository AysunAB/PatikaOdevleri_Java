package kdvHesaplama;

import java.util.Scanner;

public class KDV_Hesaplama {

    /**
     * @author aysun
     */

    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
     KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {

        double kdvsizFiyat,kdvTutari1=1.8,kdvTutari2=0.8,kdvliFiyat;//Variable'lar atanir

        Scanner scan=new Scanner(System.in);//scan objesi olusturarak kullanicidan fiyat bilgisi istenir
        System.out.print("Urun fiyatini giriniz : ");
        kdvsizFiyat=scan.nextDouble();

        kdvliFiyat=kdvsizFiyat>0&kdvsizFiyat<1000?kdvsizFiyat*kdvTutari1:kdvsizFiyat*kdvTutari2;//Kosul operatoru kullanilara
        //girilen fiyat 0 ile 1000 arasinda ise kdvTutari1 yani 1.8 ile degilse kdvTutari2 yani 0.8 ile carpilmasi saglanir
        System.out.print("Girdiginiz urunun KDV'li tutari : "+kdvliFiyat);//sonuc konsola yazdirilir



    }
}
