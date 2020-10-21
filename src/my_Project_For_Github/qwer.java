package my_Project_For_Github;

import java.util.Scanner;

public class qwer {
    public static void main(String[] args) {
        multiplication();
    }
    static void multiplication(){
        int num3;
        do {

            System.out.println("Введите первое число: ");
            Scanner in1 = new Scanner(System.in);
            int num1 = in1.nextInt();

            System.out.println("Введите второе число: ");
            Scanner in2 = new Scanner(System.in);
            int num2 = in2.nextInt();

            int rez = num1 * num2;

            System.out.println("Результат умножения чисел: " + rez);
            System.out.println("Для завершения исполнения нажмите 1");
            Scanner in3 = new Scanner(System.in);
            num3 = in3.nextInt();

        }

        while (num3!=1);
    }
}
