package com.company;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 6;
//        System.out.print(x+" ");
//        System.out.println("x="+x+"y="+y);
//        System.out.printf("x=%d; y=%d",x,y);
//        String name = "Tom";
//        int age = 30;
//        float a = 1.7f;
//        System.out.printf("name=%s; age=%d; a=%f",name,age,a);

//        Scanner b = new Scanner(System.in);
//        System.out.print("Введите ваше число:");
//         int num = b.nextInt();
//        System.out.printf("Your number: %d \n", num);
//        b.close();
        Scanner in = new Scanner(System.in); //создание потока
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println("Введите ваш вес:");
        float height = in.nextFloat();
        System.out.println("Привет, меня зовут "+name+",Мне "+age+"лет, я вешу "+height);
        in.close();
    }
}
