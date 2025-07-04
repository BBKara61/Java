package JavaProjects;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {

    public static void main(String[] args) {

        Random random=new Random();
        int bilgisayarinSayisi=random.nextInt(100);


        System.out.println("Hoş geldiniz!");
        System.out.println("0 ile 100 arasinda bir sayi tuttum, tahmin edebilir misin?");
        //System.out.println(bilgisayarinSayisi);

        Scanner scan=new Scanner(System.in);
        int kullaniciSayisi;

        int count=1;
        do {
            kullaniciSayisi=scan.nextInt();
            if (kullaniciSayisi>bilgisayarinSayisi){
                System.out.println("Daha kucuk bir sayi tahmin etmelisin!");
            } else if (kullaniciSayisi<bilgisayarinSayisi) {
                System.out.println("Daha buyuk bir sayi tahmin etmelisin!");

            }else {
                System.out.println("Vay be! Buldun gerçekten."+ count+". tahminde bildin.");
            }
            count++;
        } while (kullaniciSayisi!=bilgisayarinSayisi);
    }
}
