package JavaProjects;

import java.util.Scanner;

public class sicaklik2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        int minSicaklik=Integer.MAX_VALUE;
        int maxSicaklik=Integer.MIN_VALUE;
        System.out.println("Lütfen gün içindeki sicaklik değerlerini giriniz: ");





        while (true){
            String input=scan.nextLine();
            if (input.equals("e")){
                break;
            } else if (!input.matches("-?\\d+")){
                System.out.println("Lütfen sadece sıcaklik degerlerini giriniz! Bitirmek için 'e'tusuna basiniz!");
                continue;
                }
                int sicaklik=Integer.parseInt(input);
            if (sicaklik>maxSicaklik){
                maxSicaklik=sicaklik;
            }
            if (sicaklik<minSicaklik){
                minSicaklik=sicaklik;
            }

            }
        System.out.println("Günün en sicak değeri: "+maxSicaklik);
        System.out.println("Günün en soguk değeri: "+minSicaklik);
        }
    }

