package coreJava;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class fibonacciSerisi {

    public static void main(String[] args) {


        System.out.println(fibonacciSerisiOlustur(1));
        System.out.println(fibonacciSerisiOlustur(0));
        System.out.println(fibonacciSerisiOlustur(2));
        System.out.println(fibonacciSerisiOlustur(5));
        System.out.println(fibonacciSerisiOlustur(15));
        System.out.println(fibonacciSerisiOlustur(25));


    }

    public static List<Integer> fibonacciSerisiOlustur(int sayiadedi){

        List<Integer>fibonacciSerisi=new ArrayList<>();
        if (sayiadedi<=0){
            System.out.println("Sayi adedi 0'dan farklı olmalıdır!");
        } else if (sayiadedi==1) {
            fibonacciSerisi.add(0);
        } else if (sayiadedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i = 2; i <sayiadedi; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+fibonacciSerisi.get(i-1));
        }



        }


        return fibonacciSerisi;
    }
}
