package Java_Practice;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime=scan.next();
        int sayac=0;

        while (sayac< kelime.length()){

            if (sayac%2==1){

                System.out.println(sayac+". indektexi harf: "+kelime.charAt(sayac));

            }
            sayac++;

        }
    }
}
