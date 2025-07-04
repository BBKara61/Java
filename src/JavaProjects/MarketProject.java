package JavaProjects;

import java.time.LocalDate;
import java.util.Scanner;

public class MarketProject {

   static Scanner scan=new Scanner(System.in);
   static boolean ekUrun=false;
   static int urunKodu;
   static String urunAd;
   static int urunFiyat;
   static int urunAdedi;
   static int toplam;
   static String sepet=" ";

    public static void main(String[] args)  { girisEkrani();}

        public static void girisEkrani() {

        System.out.println("----- T141 KARAMARKET -----");
        System.out.println("==== Hoş geldiniz! ====");
        System.out.println("Lütfen alısveris yapacagınız reyonu seciniz!");
        System.out.println("\t1-Sarkuteri Reyonu\n\t2-Manav Reyonu\n\t3-Market Reyonu\n\t4-Fis Yazdirma\n\t5-Cikis");

        System.out.print("Seciminiz: ");
        int secim= scan.nextInt();
        if (!(secim>=1 && secim<=5  )){

            System.out.println("Gecersiz bir tuslama yaptınız!");
            girisEkrani();
        } else {

            switch (secim){

                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    Cikis();
                    break;
                default:
            }

        }




    }

    private static void sarkuteri() {
        System.out.println("Sarkuteri reyonuna hos geldiniz!");
        System.out.println("Lütfen almak istediginiz urunu seciniz");
        System.out.println("\t101-Peynir   250tl\n\t102-Tereyag   500tl\n\t103-Yogurt   30tl\n\t104-Sucuk   320tl\n\t105-Yumurta   95tl");
        while (!ekUrun){
            System.out.print("Urun kodu:");
            urunKodu=scan.nextInt();
            if (urunKodu==0) {
                girisEkrani();

            }
            else if (!(urunKodu>=101 && urunKodu<=105)){

                System.out.println("Yanlis bir urun kodu girdiniz. Tekrar deneyiniz!");
                sarkuteri();
            }else
                if (urunKodu>=101 && urunKodu<=105){
                System.out.println("Kac paket alacaksınız?");
                urunAdedi=scan.nextInt();

                switch (urunKodu){
                    case 101:
                        urunAd="Peynir";
                        urunFiyat=250;
                        System.out.println(urunAdedi+" paket "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 102:
                        urunAd="Tereyag";
                        urunFiyat=500;
                        System.out.println(urunAdedi+" paket "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 103:
                        urunAd="Yogurt";
                        urunFiyat=30;
                        System.out.println(urunAdedi+" paket "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 104:
                        urunAd="Sucuk";
                        urunFiyat=320;
                        System.out.println(urunAdedi+" paket "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 105:
                        urunAd="Yumurta";
                        urunFiyat=95;
                        System.out.println(urunAdedi+" paket "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                }
            urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplm tutar: "+toplam);
                sepet+=urunAdedi+" paket "+urunAd+" fiyatı: "+(urunFiyat)+"'TL dir";
                System.out.println("Baska bir urun icin yeni urun kodunu girebilirsiniz. Aksi takdirde 0 tusuna basınız!");


            }

        }
        ekUrun=false;
    }

    private static void manav() {
        System.out.println("---- Manav reyonuna hos geldiniz! ----");
        System.out.println("Lütfen almak istediginiz urun kodunu giriniz");
        System.out.println("\t201-Elma   40tl\n\t202-Portakal   40tl\n\t203-Salatalık   30tl\n\t204-Domates   35tl\n\t205 Muz   45tl");

        while (!ekUrun){
            System.out.print("Urun kodu: ");
            urunKodu= scan.nextInt();
            if (urunKodu==0){
                girisEkrani();
            } else if (!(urunKodu>=201 && urunKodu<=205)) {
                System.out.println("Lütfen gecerli bir kod giriniz!");
                manav();
            } else if (urunKodu>=201 && urunKodu<=205) {
                System.out.println("Kac kg alacaksınız?");
                urunAdedi= scan.nextInt();

                switch (urunKodu){
                    case 201:
                        urunAd="Elma";
                        urunFiyat=40;
                        System.out.println(urunAdedi+" kg "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 202:
                        urunAd="Portakal";
                        urunFiyat=40;
                        System.out.println(urunAdedi+" kg "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 203:
                        urunAd="Satalalık";
                        urunFiyat=30;
                        System.out.println(urunAdedi+" kg "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 204:
                        urunAd="Domates";
                        urunFiyat=35;
                        System.out.println(urunAdedi+" kg "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    case 105:
                        urunAd="Muz";
                        urunFiyat=45;
                        System.out.println(urunAdedi+" kg "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                        break;
                    default:


            }
            urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplam Tutar: "+toplam);
                sepet+=urunAd+" : "+urunFiyat+" TL dir\n";

                System.out.println("Baska bir urun icin yeni urun kodunu girebilirsiniz. Aksi takdirde 0 tusuna basınız!");
        }
    }
    }

    private static void market() {
        System.out.println("---- Market reyonuna hos geldiniz! ----");
        System.out.println("Lütfen almak ıstediginiz ürün kodunu giriniz");
        System.out.println("\t301-Nutella 750 gr   128tl\n\t302- Makarna   20tl\n\t303-Cicibebe   50tl\n\t304-Dondurma   75tl\n\t305-Centro Muzlu Gofret   35tl");
        while (!ekUrun){
            System.out.print("Urun Kodu: ");
            urunKodu= scan.nextInt();

            if (urunKodu==0){
                girisEkrani();
            } else if (!(urunKodu>=301 && urunKodu<=305)) {
                System.out.println("Lutfen gecerli bir kod giriniz!");
                market();
            } else if (urunKodu>=301 && urunKodu<=305) {
                switch (urunKodu){

                    case 301:
                        urunAd="Nutella 750 gr";
                        urunFiyat=128;
                        System.out.println(urunAdedi+" adet "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                    case 302:
                        urunAd="Makarna";
                        urunFiyat=20;
                        System.out.println(urunAdedi+" adet "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                    case 303:
                        urunAd="Cicibebe";
                        urunFiyat=50;
                        System.out.println(urunAdedi+" adet "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                    case 304:
                        urunAd="Dondurma";
                        urunFiyat=75;
                        System.out.println(urunAdedi+" adet "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");
                    case 305:
                        urunAd="Centro Muzlu Gofret";
                        urunFiyat=35;
                        System.out.println(urunAdedi+" adet "+urunAd+" fiyatı "+(urunAdedi*urunFiyat)+" tl dir.");

                }
                urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplam Tutar: "+toplam);
                sepet+=urunAd+" : "+urunFiyat+" TL dir\n";

                System.out.println("Baska bir urun icin yeni urun kodunu girebilirsiniz. Aksi takdirde 0 tusuna basınız!");

            }

        }


    }

    private static void fisYazdir() {
        System.out.println("Fis yazdırma ekranina yonlendiriliyorsunuz...");
        System.out.println("                                    ");
        System.out.println("----------   Alısveris Fisi   ----------");
        System.out.println("----------   KaraMarket   ----------");
        System.out.println(" ");
        System.out.println(sepet);
        System.out.println("Toplam Tutar: "+toplam);
        System.out.println("%8 KDV: "+(toplam*0.08));
        toplam*=1.08;
        System.out.println("Ödenecek tutar: "+(toplam));
        System.out.println("Ödenen: ");
        int ödenen=scan.nextInt();
        if (ödenen<toplam){
            System.out.println("Ödeme yeterli degil. "+(toplam-ödenen)+" kadar daha odeme yapmalısınız!");
        }else {
            System.out.println("Para ustu: "+(ödenen-toplam));
        }
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz!\n Yine bekleriz.");
        LocalDate date=LocalDate.now();
        System.out.println(date);
        Cikis();
    }

    private static void Cikis() {
        System.out.println("Cikis Yapiliyor...");
        System.exit(0);
    }


}

