package Java_Practice;

import java.util.Scanner;

public class forLoops3 {

    public static void main(String[] args) {

        /*Kullanıcıdan 10 adet sayı alıp 5 ile 10 arasındaki sayıları
        toplamayıp diğerlerini toplayınız
         */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Lütfen "+i+". sayıyı giriniz: ");
            int number= scan.nextInt();
            if (number>=5 && number<=10){
                continue;
            }
            toplam+=number;
        }
        System.out.println("Sayıların toplami: "+toplam);
    }
}
