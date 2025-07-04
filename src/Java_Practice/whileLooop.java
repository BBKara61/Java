package Java_Practice;

import java.util.Scanner;

public class whileLooop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bulmak istediğiniz sayıyı giriniz: ");
        int taban=scan.nextInt();
        System.out.println("Lütfen üs sayısını giriniz: ");
        int us=scan.nextInt();
        System.out.println("Sonuc: "+usHesapla(taban,us));
    }
    public static long usHesapla(int taban, int us){

        long sonuc=1;
        while(us !=0){
            sonuc*=taban;
            us--;
        }
        return sonuc;
    }
}
