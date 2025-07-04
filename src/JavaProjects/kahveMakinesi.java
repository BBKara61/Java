package JavaProjects;

import java.util.Scanner;

public class kahveMakinesi {

    public static void main(String[] args) {
            while (true){
        Scanner scan=new Scanner(System.in);
        System.out.println("Hoş geldiniz!");
        System.out.println("Hangi kahveyi istersiniz?"+ "\nTürk kahvesi"+ "\nFiltre Kahve"+ "\nEspresso");

        String hangikahve=scan.nextLine();

        if (hangikahve.equalsIgnoreCase("Türk Kahvesi")||hangikahve.equalsIgnoreCase("Turk Kahvesi")){

            System.out.println("Türk kahvesi hazırlanıyor...");
        } else if (hangikahve.equalsIgnoreCase("Filtre kahve")) {
            System.out.println("Filtre kahve hazırlaniyor...");
            
        } else if (hangikahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Espresso hazırlaniyor...");
            
        }else {
            System.out.println("Hatali giris yaptınız! Tekrar deneyiniz!");
            continue;
        }

        System.out.println("Süt eklememizi ister misiniz? (Evet ya da Hayır)");
        String sut=scan.nextLine();

        if (sut.equalsIgnoreCase("Evet")){
            System.out.println("Süt ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("Süt eklenmiyor.");
        }else {
            System.out.println("Hatali bir giris yaptiniz!");
            continue;
        }

                System.out.println("Seker ister misiniz? (Evet ya da Hayır)");
        String seker= scan.nextLine();
        int kacseker;

        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker istersiniz?");
            kacseker= scan.nextInt();
            System.out.println(kacseker+ "seker ekleniyor..");
        }else {
            System.out.println("Seker eklenmiyor! Enter tusuna basınız!");
        }
        String boskod=scan.nextLine();  // ÖNEMLİ //
                System.out.println("Hangi boy istersiniz? (Buyuk - orta - kucuk olarak giriniz!)");

                String boyut=scan.nextLine();
        if (boyut.equalsIgnoreCase("Büyük")|| boyut.equalsIgnoreCase("Buyuk")){
            System.out.println("Kahveniz "+ boyut+ " boy olarak hazırlaniyor...");
        } else if (boyut.equalsIgnoreCase("Orta")) {
            System.out.println("Kahveniz "+ boyut+" boy olarak hazirlaniyor...");

        } else if (boyut.equalsIgnoreCase("Kücük")||boyut.equalsIgnoreCase("Kucuk")) {
            System.out.println("Kahveniz "+ boyut+" boy olarak hazırlaniyor...");

        }else {
            System.out.println("Hatali bir giris yaptınız!");
        }
                System.out.println("Afiyet olsun!");

                break;


    }

    }
}
