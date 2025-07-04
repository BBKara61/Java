package Java_Practice;

import java.util.Scanner;

public class String_Manipulation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminiz: ");
        String name= scan.nextLine();
        System.out.println("Soyisminiz: ");
        String surname=scan.nextLine();
        System.out.println("Lütfen arada boşluk bırakmadan 16 haneli kredi kartı numaranızı giriniz: ");
        String creditcard=scan.nextLine();

        name=name.substring(0,1).toUpperCase()+name.substring(1).replaceAll("\\w","*");
        surname=surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*");

        if (creditcard.length()!=16 ){
            System.out.println("Geçersiz bir kredi kartı numarası girdiniz!");
        }else {

            System.out.println("Adı: "+name+" ");
            System.out.println("Soyadı: "+ surname+ " ");
            System.out.println("Kredi Karti no: "+creditcard.substring(0,13).replaceAll("\\w","*")+creditcard.substring(12));
        }

    }
}
