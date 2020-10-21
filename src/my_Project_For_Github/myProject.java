package my_Project_For_Github;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myProject {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Хотите задачи с математическими моделями или с массивами? (Для выхода нажмите 1)");
            Scanner in222 = new Scanner(System.in);
            String op = in222.nextLine();

            if (op.equals("1")) {
                System.exit(0);
            }

            boolean isContain1 = (op.contains("с моделями") || op.contains("модели"));
            boolean isContain2 = (op.contains("с массивами") || op.contains("массивы"));

            if (isContain1) {
                try {
                    System.out.println("Какую программу хотите запустить? \n" +
                            "1.Перевод в евро и доллары\n2.Арифметическая прогрессия\n3.Треугольник Паскаля\n4.Числа Фибоначчи\n" +
                            "5.Факториал\n6.Умножение чисел\n" +
                            "7.Таблица умножения\n8.Действия с числами\n9.Тетрация \n10.Вклад");
                    Scanner in = new Scanner(System.in);
                    int vv = in.nextInt();
                    if (vv == 1) {
                        Valuta();
                    } else if (vv == 2) {
                        Arifm();
                    } else if (vv == 3) {
                        Pascals_triangle();
                    } else if (vv == 4) {
                        Fibonacсi();
                    } else if (vv == 5) {
                        Fact();
                    } else if (vv == 6) {
                        multiplication();
                    } else if (vv == 7) {
                        tablymn();
                    }
//        Operashii();
                    else if (vv == 8) {
                        Operacii2();
                    } else if (vv == 9) {
                        Tetracia();
                    }
//                Valuta2();
                    else if (vv == 10) {
                        Vklad();
                    } else {
                        System.out.println("Введите число от 1 до 10");
                    }
                } catch (InputMismatchException exc) {
                    System.out.println("Неверный формат ввода");
                }

            } else if (isContain2) {
                System.out.println("Какую программу хотите запустить? \n" +
                        "1.Элементы меньше 5\n2.Задать два массива, чтобы вернуть общие элементы" +
                        "\n3.Узнать максимальное и минимальное значение массива\n4.Узнать является ли массив палиндромом\n" +
                        "5.Сложение массивов\n" +
                        "6.Создать массив, вывести все четные числа, но если встретиться число 237 - остановить вывод\n" +
                        "7.Написать программу которая выводит все элементы, которые есть в первом массиве, но нет во втором\n" +
                        "8.Создать массив и посчитать сколько раз в нем встречается число 4");
                Scanner in = new Scanner(System.in);
                int vv2 = in.nextInt();
                if (vv2 == 1) {
                    massiv1();
                } else if (vv2 == 2) {
                    massiv2();
                } else if (vv2 == 3) {
                    massiv3();
                } else if (vv2 == 4) {
                    massiv4();
                } else if (vv2 == 5) {
                    massiv5();
                } else if (vv2 == 6) {
                    massiv6();
                } else if (vv2 == 7) {
                    massiv7();
                } else if (vv2 == 8) {
                    massiv8();
                } else if (vv2 == 9) {
                    hw1();
                } else if (vv2 == 10) {
                    hw2();
                }
            } else {
                System.out.println("введена неверная команда");
            }
        }
    }

    static void Fibonacсi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи: ");

        int kol = in.nextInt();
        int fib1 = 0;
        int fib2 = 1;

        System.out.print(fib2 + " ");

        for (int i = 0; i < kol / 2; i += 1) {
            fib1 += fib2;
            fib2 += fib1;
            System.out.print(fib1 + " " + fib2 + " ");

        }
        System.out.println();
    }


    static void Fact() {
        System.out.println("Введите факториал числа: ");
        Scanner in1 = new Scanner(System.in);
        int f = in1.nextInt();

        int c = 1;

        for (int a = 1; a <= f; a++) {


            int b = a * c;
            c = b;

        }

        System.out.println(c);
    }

    static void Arifm() {
        System.out.println("Введите начало арифметической прогрессии: ");
        Scanner in1 = new Scanner(System.in);
        int a1 = in1.nextInt();

        System.out.println("Введите конец арифметической прогрессии: ");
        Scanner in2 = new Scanner(System.in);
        int end = in2.nextInt();

        System.out.println("Введите шаг арифметической прогрессии: ");
        Scanner in3 = new Scanner(System.in);
        int d = in3.nextInt();


        System.out.println(a1);
        int a2 = 0;
        for (; a1 <= end - d; ) {

            a2 = a1 + d;

            a1 = a2;

            System.out.println(a1);
        }
    }


    static void multiplication() {
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

        while (num3 != 1);
    }


//    static void Operacii(){
//        Scanner opera = new Scanner(System.in);
//        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
//        int oper = opera.nextInt();
//
//        if (oper==1){
//            System.out.println("Сложение");
//        }
//        else if (oper==2){
//            System.out.println("Вычитание");
//        }
//        else if (oper==3){
//            System.out.println("Умножение");
//        }
//        else {
//            System.out.println("Операция неопределена");
//        }
//    }

    // Пусть пользователь кроме номера операции вводит два числа,
// и в зависимости от номера операции с введенными числами выполняются
// определенные действия (например, при вводе числа 3 числа умножаются).
// Результат операции выводиться на консоль.
//
//Пример работы программы:
//Введите первое число: 5
//Введите второе число: 2
//Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение
//1
//Результат операции: 7

    static void Operacii2() {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int num2 = number2.nextInt();

        Scanner opera = new Scanner(System.in);
        System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
        int oper = opera.nextInt();

        if (oper == 1) {
            int rez1 = num1 + num2;
            System.out.println("Результат операции: " + (rez1));
        } else if (oper == 2) {
            int rez2 = num1 - num2;
            System.out.println("Результат операции: " + (rez2));
        } else if (oper == 3) {
            int rez3 = num1 * num2;
            System.out.println("Результат операции: " + (rez3));
        } else {
            System.out.println("Операция неопределена");
        }
    }

    static void Pascals_triangle() {
        String s = " ";

        System.out.println("Введите количество столбцов треугольника Паскаля: ");
        Scanner in1 = new Scanner(System.in);
        int kol = in1.nextInt();

        for (int i = 1; i <= kol; i++) {
            for (int j = 1; j <= kol - i; j++) {
                System.out.print(s);

            }

            for (int x = 1; x <= i; x++) {
//                int a = x+1;
                System.out.print(i);

            }
            System.out.println();

        }
    }

    static void tablymn() {
        int x = 1;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                x = i * j;

                if (j == 9) {
                    if (x > 9) {
                        System.out.println(x + "   ");
                    } else {
                        System.out.println(x + "    ");
                    }

                } else {
                    if (x > 9) {
                        System.out.print(x + "   ");
                    } else {
                        System.out.print(x + "    ");
                    }
                }
            }

        }
    }

    static void Tetracia() {
        System.out.println("Введите число для тетрации: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int number = num * num;
        int number2 = number * number;
        int number3 = number2 * number2;
        int number4 = number3 * number3;

        System.out.println(number4);

    }

    static int triangular_Representation() {
        System.out.println("Введите число для треугольного представления: ");
        Scanner in1 = new Scanner(System.in);
        int kol = in1.nextInt();

        int b = 1;
        for (int i = 1; i <= kol; i++) {
            int a = (i * (i + 1)) / 2;
            b = a;
        }
        System.out.println(b + " ");
        return b;


    }

    static void Valuta() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите перевести: ");
        double summa = myScanner.nextDouble();

        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Хотите перевести в доллары или в евро?");
        String val = myScanner2.nextLine();


        boolean isContain1 = val.contains("в доллары");
        boolean isContain2 = val.contains("в евро");

        if (isContain1) {


            double itog11 = summa / 77.35;

            System.out.println(itog11);
//            return itog11;

        } else if (isContain2) {
            double itog22 = summa / 90.61;
            System.out.println(itog22);
//            return itog22;
        } else {
            System.out.println("введена неверная команда");
        }
    }
//return summa;


//        static void Valuta2 () {
//            Scanner myScanner = new Scanner(System.in);
//            System.out.println("Введите сумму, которую хотите перевести: ");
//            double summa = myScanner.nextDouble();
//
//            Scanner myScanner2 = new Scanner(System.in);
//            System.out.println("Хотите перевести в доллары (нажмите 1) или в евро (нажмите 2) ?");
//            int val = myScanner2.nextInt();
//
//
//            if (val == 1) {
//
//
//                double itog11 = summa / 77.35;
//
//                System.out.println(Math.round(itog11));
//
//            } else if (val == 2) {
//                double itog22 = summa / 90.61;
//                System.out.println(itog22);
//            }
//        }

//В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
// Напишите консольную программу, в которую пользователь вводит сумму вклада.
// Если сумма вклада меньше 100, то начисляется 5%.
// Если сумма вклада от 100 до 200, то начисляется 7%.
// Если сумма вклада больше 200, то начисляется 10%.
// В конце программа должна выводить сумму вклада с начисленными процентами.

    static void Vklad() {
        Scanner in = new Scanner(System.in); //класс
        System.out.println("Введите сумму вклада: ");
        double summa = in.nextDouble();
        in.close();
        if (summa < 100) {
            summa = summa + summa * 0.05;
            System.out.println(summa);

        } else if (summa >= 100 && summa <= 200) {
            summa = summa + summa * 0.07;
            System.out.println(summa);
        } else {
            summa = summa + summa * 0.1;
            System.out.println("summa");
        }
    }

    //1. Создать массив, вывести все элементы массива < 5
    static void massiv1() {
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

    static void massiv2() {
        //Даны 2 массива, вернуть общие элементы этих двух массивов

        System.out.println("Введите длину 1 массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите длину 2 массива: ");
        Scanner in2 = new Scanner(System.in);
        int size2 = in.nextInt();
        int[] num2 = new int[size2];

        System.out.println("Введите элементы 1 массива: ");
        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }
        System.out.println("Введите элементы 2 массива:");
        for (int i = 0; i < size2; i++) {
            num2[i] = in.nextInt();
        }

//        boolean areEqual = Arrays.equals(num1, num22);
//        System.out.println(Arrays.equals(a1, a2)); // prints true
        System.out.println("Общие элементы: ");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    System.out.println(num1[i]);
                }
            }
        }
    }

    static void massiv3() {
        //Вывести максимальное и минимальное значение массива
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }

        int minValue = num1[0];

        int maxValue = num1[0];

        for (int i = 1; i < num1.length; i++) {
            if (num1[i] < minValue) {
                minValue = num1[i];


            }
        }
        for (int j = 1; j < num1.length; j++) {
            if (num1[j] > maxValue) {
                maxValue = num1[j];
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение " + maxValue);

    }

    //4. Является ли массив палиндромом
    static void massiv4() {
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }

        boolean t = true;
        for (int i = 0; i < num1.length / 2; i++) {

            if (num1[i] != num1[num1.length - i - 1]) {

                t = false;
                break;
            }
        }

        if (t) {
            System.out.println("Массив является палиндромом");
        } else {
            System.out.println("Массив не является палиндромом");
        }
    }

    static void massiv5() {

        System.out.println("Введите длину первого массива: ");
        Scanner in1 = new Scanner(System.in);
        int size1 = in1.nextInt();
        int[] num1 = new int[size1];

        System.out.println("Введите длину второго массива: ");
        Scanner in2 = new Scanner(System.in);
        int size2 = in2.nextInt();
        int[] num2 = new int[size2];

        System.out.println("Введите элементы первого массива: ");
        for (int i = 0; i < size1; i++) {
            num1[i] = in1.nextInt();
        }
        System.out.println("Введите элементы второго массива: ");
        for (int i = 0; i < size2; i++) {
            num2[i] = in2.nextInt();
        }
        System.out.println("Первый массив+второй:");
        int[] num1num2 = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++) {
            num1num2[i] = num1[i];
        }
        for (int j = num1.length; j < num1num2.length; j++) {
            num1num2[j] = num2[j - num1.length];
        }

        for (int k = 0; k < num1num2.length; k++) {
            System.out.println(num1num2[k]);
        }
    }

    //6. Создать массив, вывести все четные числа, но если встретиться число 237 - остановить вывод
    static void massiv6() {
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите элементы массива: ");


        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }
        System.out.println("Четные элементы: ");
        for (int i = 0; i < num1.length; i++) {
            if ((num1[i] != 237) && (num1[i] % 2 == 0)) {
                System.out.println(num1[i]);
            }
        }
    }

    //7. Написать программу которая выводит все элементы, которые есть в первом массиве, но нет во втором
    static void massiv7() {
        System.out.println("Введите количество элементов первого массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите элементы первого массива: ");

        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }

        System.out.println("Введите количество элементов второго массива: ");
        Scanner in2 = new Scanner(System.in);
        int size2 = in2.nextInt();
        int[] num2 = new int[size2];

        System.out.println("Введите элементы второго массива: ");

        for (int i = 0; i < size2; i++) {
            num2[i] = in2.nextInt();
        }

        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            count = 0;
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] != num2[j]) {
                    count++;
                    if (count == num2.length) {
                        System.out.println(num1[i]);
                    }
                }
            }

        }
    }

    //8. Создать массив и посчитать сколько раз в нем встречается число 4
    static void massiv8() {
        System.out.println("Введите длину массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num1 = new int[size];

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            num1[i] = in.nextInt();
        }

        int k = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == 4) {
                k += 1;
            }

        }
        System.out.println("В массиве число 4 встречается " + k + " раз(а)");
    }

    static void hw1() {
        double nas = 10_000_000;

        for (int i = 1; i <= 10; i++) {
            double rozh = nas * 0.014;
            double smert = nas * 0.008;
            double itog = rozh - smert;

            double nas1 = nas + itog;
            nas = nas1;

        }
        int nas3 = (int) nas;
        System.out.println(nas3);

    }

    static void hw2() {
        double nas = 10_000_000;
        double chrozh = 0.014;
        double chsmert = 0.008;

        for (int i = 1; i <= 10; i++) {


            double rozh = nas * chrozh;
            double smert = nas * chsmert;
            double itog = rozh - smert;

            double nas1 = nas + itog;
            nas = nas1;

            if (chrozh > 0.007) {
                chrozh = chrozh - 0.001;
                //  System.out.println(chrozh);
            }
            if (chsmert > 0.006) {
                chsmert = chsmert - 0.001;
                // System.out.println(chsmert);
            }
        }

        int nas3 = (int) nas;
        System.out.println(nas3);
    }
}







