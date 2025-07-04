package BasicJavaPractice;

import java.util.Scanner;

public class stringSayiTersi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz!");
        int sayi=scan.nextInt();

        String tersSayi=tersiniBul(sayi);

        System.out.println("Girdiginiz sayinin tersi: "+tersiniBul(sayi));


    }

    public static String tersiniBul (int sayi){

        String strSayi=Integer.toString(sayi);

        StringBuilder tersSayi= new StringBuilder();


        for (int i = strSayi.length()-1; i >=0 ; i--) {

            tersSayi.append(strSayi.charAt(i));

        }



        return tersSayi.toString();
    }
}
