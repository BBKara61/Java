package coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        ArrayList<String> deneme1=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        String isim="";
        while (!isim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklemek icin isim giriniz: \nİşlemi sonlandırmak için q tuşuna basınız!");

            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("q")){

                isimler.add(isim);

            }
        }
        System.out.println("Girilen isimler: " + isimler);
    }
}
