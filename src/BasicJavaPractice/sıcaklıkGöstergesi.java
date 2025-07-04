package BasicJavaPractice;

import java.util.Scanner;

public class sıcaklıkGöstergesi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double minSicaklik=Double.MAX_VALUE;
        double maxSicaklik=Double.MIN_VALUE;

        System.out.println("Lütfen gün içindeki sicaklik degerlerini giriniz: ");

        while (true){

            String input=scan.nextLine();
            if (input.equals("e")){
                break;
            }

            double sicaklik=Double.parseDouble(input);

            if (sicaklik>maxSicaklik){
                maxSicaklik=sicaklik;
            }
            if (sicaklik<minSicaklik){

                minSicaklik=sicaklik;
            }

        }
        System.out.println("Günün en sicak değeri: "+maxSicaklik);
        System.out.println("Günün en soguk degeri: "+minSicaklik);
    }
}
