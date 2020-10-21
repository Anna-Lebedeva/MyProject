package com.company;
import java.util.Scanner;

public class lesson17 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите индекс числа из массива: ");

                int x = in.nextInt();
                int nums[] = new int[]{1,2,3,4,5};

                        System.out.println(nums[6]);




            } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();

                System.out.println("Введен большой индекс");
            } catch (Exception e) {
                System.out.println("Сработало общее исключение");
            }
        }
    }
}
