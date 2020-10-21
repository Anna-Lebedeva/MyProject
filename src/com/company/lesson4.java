package com.company;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 7;
//        int c = a+b;
//        int d = 4+b;
//        System.out.println(d);
//        double a1 = 10.0;
//        int b2 = 4;
//        double c2 = a1/b2;
//        System.out.println(c2);
//        int z = 8;
//        int a5 =z--;
//        System.out.println(a5);
//        System.out.println(z);

        double d = 2.0-1.1;
        System.out.println(d);
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Какой язык программирования вы изучаете?");
        String language = myscanner.nextLine(); //вводимая строка присваивается language
        System.out.println("Вы изучаете"+language);



    }
}
