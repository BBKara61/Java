package coreJava;

import java.util.Scanner;

public class forEachhLoop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cümlenizi giriniz: ");
        String cümle=scan.nextLine();

        String harf="";
        while (harf.length()!=1){
            System.out.println("Lütfen bir harf giriniz: ");
            harf=scan.nextLine();
        }

        String[] harfArrayi=cümle.split("");
        int sayac=0;

        for (String eachharf : harfArrayi){
            if (eachharf.equalsIgnoreCase(harf)){

                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Verdiginiz harf hic kullanilmamis");
        }else {
            System.out.println("Verdiginiz "+ harf +" harfi "+sayac+ " defa kullanılmıstır.");

        }
    }
}
