package Java_Practice;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 3 harfli bir kelime giriniz: ");

        String word= scan.next();

        char w1=word.charAt(0);
        char w2=word.charAt(1);
        char w3=word.charAt(2);

        String sonuc=word.length()==3 ? ((w1!=w2 && w2!=w3 && w1!=w3) ? "Girilen 3 harfli kelime unique harflerden oluşuyor."
                :"Girilen 3 harfli kelime unique harflerden oluşmuyor.") : "Girilen kelime 3 harfli değil." ;

        System.out.println(sonuc);
    }
}
