package Java_Practice;

import java.util.Locale;

public class forLoops2 {
    public static void main(String[] args) {

         String text="Java Candir,gerisi heyecandir";
         int a=0;

        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().charAt(i)=='a'){
                a++;
            } else if (text.charAt(i)=='c') {
                break;

            }

        }
        System.out.println("a harfi sayısı: "+a);
    }
}
