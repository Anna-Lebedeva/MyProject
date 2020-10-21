package com.company;
import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = in.nextInt();

        if (number1==2 || number1==9){
            System.out.println("Число либо равно 2, либо равно 9");

//        }
//        else if(number1==number2) {
//            System.out.println("Числа равны");

        }
        else
        {
            System.out.println("Неизвестное число");
        }
    }
}
