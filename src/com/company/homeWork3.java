package com.company;
import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //создание потока
        System.out.println("Введите дату рождения:");
        int data = in.nextInt();

        int key = 99237623; //
        int encrypt = data^key;//1001011

        System.out.println("Ваша зашифрованная дата рождения: "+encrypt);

        System.out.println("Введите еще одну дату рождения:");
        int data2 = in.nextInt();
        System.out.println("Введите ключ шифрования:");
        int key2 = in.nextInt();
        int encrypt2 = data2^key2;
        System.out.println("Ваша вторая зашифрованная дата рождения: "+encrypt2);




        in.close();

    }
}
