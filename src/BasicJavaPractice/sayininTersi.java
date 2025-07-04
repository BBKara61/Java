package BasicJavaPractice;

import java.util.Scanner;

public class sayininTersi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz!");
        int sayi=scan.nextInt();

        System.out.println("Girdiginiz sayinin tersi: "+ sayilarınTersiniBul(sayi) );
    }

    public static int sayilarınTersiniBul(int sayi){

        int tersSayi=0;
        while (sayi!=0){

            int basamak=sayi%10;
            tersSayi=tersSayi*10+basamak;
            sayi=sayi/10;

        }


        return tersSayi;
    }
}
