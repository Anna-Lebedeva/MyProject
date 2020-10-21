package my_Project_For_Github;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //1. Создать массив, вывести все элементы массива < 5
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Элементы меньше 5: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 5) {
                System.out.println(nums[i]);
            }
        }
    }
}

