package JavaProjects;

import java.util.*;

public class sicaklikList {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        List<Double> dailytemps=new ArrayList<>();
        int out=100;
        double temp=0;
        int sayac=0;


        do {
            System.out.println("Lütfen günlük sıcaklik değerlerinizi giriniz: (100 yazıldığında işlem sona ermektedir!)");
            temp= scan.nextDouble();

            if (temp!=100){
                dailytemps.add(temp);
                sayac++;
            }
        }while (temp!=100);{

            System.out.println("Veri girisi sonlandırıldı!");
        }
        Collections.sort(dailytemps);
        System.out.println("Günün en sıcak değeri: "+dailytemps.get(sayac-1));
        System.out.println("Gunun en soguk değeri: "+dailytemps.get(0));
    }
}
