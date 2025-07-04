package BasicJavaPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ATM {

    static Scanner scan=new Scanner(System.in);
    static String kartNo="123456";
    static String sifre="1234";
    static double bakiye=30000;

    public static void main(String[] args) {

        giris();
    }

    private static void giris() {


        System.out.println("**************WiseBanka Hos geldiniz!**************\n"+
                "Güvenliğiniz için kart ve sifre bilgilerinizi kimseyle paylasmayiniz\n"+
                "----------------------------------------");
        System.out.println("Kart numaranizi giriniz: ");
        String kkartNo=scan.nextLine();

        System.out.println("Sifrenizi giriniz: ");
        String ksifre=scan.nextLine();
        kkartNo=kkartNo.replaceAll("\\s","");

        if (kkartNo.equals(kartNo) && ksifre.equals(sifre)){

            menu();
        }else {
            System.out.println("Hatali bir giris yaptiniz!");
            giris();
        }
    }

    public static void menu() {
        System.out.println("Yapmak istediginiz islemin numarasini giriniz: \n"+
                "1.Bakiye Sorgulama\n"+"2.PARA YATIRMA\n"+"3.PARA ÇEKME\n"+"4.PARA GÖNDERME\n"+"5.SIFRE DEGİSTİRME\n"+"6.CIKIS\n"+"seciniz");
        int secim= scan.nextInt();
        switch (secim){
        case 1:{
            bakiyesorgulama();
            break;
        }
        case 2:{
            System.out.println("Yatirmak istediğiniz miktari giriniz: ");
            double miktar=scan.nextDouble();
            parayatirma(miktar);
            break;
        }
        case 3:{
            System.out.println("Cekeceginiz miktari belirleyiniz: ");
            double miktar=scan.nextDouble();
        paracekme(miktar);
        break;
        }
        case 4:{
            paragonderme();

        }
        case 5:{
            sifredegistirme();

        }
        case 6:{
            System.out.println("Bankamizi tercih ettiğiniz için teşekkürler!");
            System.exit(0);
        } default:{
                System.out.println("Hatali tuslama yaptınız. Isleminizi tekrar belirleyiniz!");
            menu();
            }
    }
}

    public static void sifredegistirme() {
        scan.nextLine();
        System.out.println("Mevcut sifrenizi giriniz: ");
        String Ksifre=scan.nextLine();

        if (Ksifre.equals(sifre) ){

            System.out.println("Yeni sifrenizi giriniz: ");
            String sifre=scan.nextLine();

            if (sifre.length()==4){
                sifre=sifre;
                System.out.println("Sifreniz guncellendi!");
                menu();
            }else {
                System.out.println("Sifreniz 4 rakamdan oluşmalıdır!");
                sifredegistirme();
            }
        }else {
            System.out.println("Hatali bir sifre girdiniz!");
            sifredegistirme();
        }
    }

    public static void paragonderme() {
        scan.nextLine();


        String pattern="^TR\\d{8}$";


        System.out.println("IBAN no giriniz: ");
        String iban=scan.nextLine().toUpperCase().replaceAll("\\s","");
        if (iban.startsWith("TR") && iban.length()==10){
            System.out.println("Miktari giriniz: ");
            double miktar= scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz!");
                paracekme(scan.nextDouble());
            }
            menu();
        }else {
            System.out.println("Gecersiz iban girdiniz!Kontrol ediniz!");
            paragonderme();
        }

    }

    public static void paracekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz!");
            paracekme(scan.nextDouble());
        }

    }

    public static void parayatirma(double miktar) {
        bakiye+=miktar;
        bakiyesorgulama();

    }

    public static void bakiyesorgulama() {

        System.out.println("Bakiyeniz: "+ bakiye);
        menu();
    }
    }
