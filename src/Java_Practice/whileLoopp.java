package Java_Practice;

import java.util.Scanner;

public class whileLoopp {
    static int bolum;
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bölünen sayıyı giriniz: ");
        int bolunen=scan.nextInt();
        System.out.println("Bölen sayıyı giriniz: ");
        int bolen= scan.nextInt();

        System.out.println("Sonuc: "+bol(bolunen,bolen));
    }

    private static int bol(int bolunen, int bolen) {

        while (bolunen>=bolen){

            bolunen-=bolen;
            bolum++;
        }
        return bolum;
    }
}
