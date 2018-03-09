package mantiksalislemler;

import java.util.Scanner;

public class Mantiksalislemler {
    public static void main(String[] args) {
        
        Scanner sayi = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        int sayi1 = sayi.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        int sayi2 = sayi.nextInt();
        
        if(sayi1 == sayi2)
            System.out.println("Sayilar esittir.");
        if(sayi1 != sayi2)
            System.out.println("Sayilar birbirine esit degildir.");
        if(sayi1 < sayi2)
            System.out.println("1.sayi 2.sayidan küçüktür");
        if(sayi1 > sayi2)
            System.out.println("1.sayi 2.sayidan büyüktür");
        if(sayi1 <= sayi2)
            System.out.println("1.sayi 2.sayidan kücük yada esittir");
        if(sayi1 >= sayi2)
            System.out.println("1.sayi 2.sayidan büyük yada esittir");
    }
    
}
