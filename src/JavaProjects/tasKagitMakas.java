package JavaProjects;

import java.util.Random;
import java.util.Scanner;

public class tasKagitMakas {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Random random=new Random();
        int kullanicisecimi=0;
        int bilgisayarsecimi=0;

        int kullanici=0;
        int bilgisayar=0;


        do {
            System.out.println("Lütfen seciminizi sayi olarak belirtiniz! (Tas icin 1, Kagit icin 2, Makas icin 3)");
            kullanicisecimi= scan.nextInt();
            bilgisayarsecimi=random.nextInt(3)+1;

            if (kullanicisecimi==1 && bilgisayarsecimi==2){
                System.out.println("Kagit tasi sarar, Bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici+ " "+" Bilgisayar: "+ bilgisayar);

            } else if (kullanicisecimi==1 && bilgisayarsecimi==3) {
                System.out.println("Tas makasi kirar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);
                
            } else if (kullanicisecimi==2 && bilgisayarsecimi==1) {
                System.out.println("Kagit tası sarar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);

            }else if (kullanicisecimi==2 && bilgisayarsecimi==3) {
                System.out.println("Makas kagidi keser, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);

            }else if (kullanicisecimi==3 && bilgisayarsecimi==1) {
                System.out.println("Tas makasi kirar, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);

            }else if (kullanicisecimi==3 && bilgisayarsecimi==2) {
                System.out.println("Makas kagidi keser, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);

            }else{
                System.out.println("Aynı seçimi yaptınız!");
                System.out.println("Kullanici: "+kullanici+" "+ " Bilgisayar: "+bilgisayar);
                System.out.println("");
            }
        }while (kullanici!=5 && bilgisayar!=5);{

             if (kullanici>bilgisayar){
                 System.out.println("Kazandiniz!!!!");
             }else {
                 System.out.println("Bilgisayarlar dünyayı ele geçiriyor! Kaybettiniz!");

             }
        }

    }
}
