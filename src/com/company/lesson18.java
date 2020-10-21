package com.company;

import java.util.Scanner;

public class lesson18 {
    public static void main(String[] args) {
        try {
//            int nums[] = new int[3];
//            nums[6]=Integer.parseInt("jfd");
//            nums[4]=45;
//            System.out.println(nums[4]);
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x > 30) {
                throw new Exception("Число х не должно быть больше 30");
            }


//            System.out.println("Выход за пределы массива");
//
//        }
//        catch (NumberFormatException ex){
//
//            System.out.println("Ошибка преобразования из строки в число");
//        }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("Это блок finally");
        }
        System.out.println("Программа завершена");
    }
}
