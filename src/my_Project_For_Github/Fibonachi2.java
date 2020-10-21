package my_Project_For_Github;
import java.util.Scanner;

public class Fibonachi2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи: ");
        int kol = in.nextInt();

        int a=1; int b = 1; int c;



        for ( int i=0; i<kol; i++) {
            c=a+b;
            a=b; b=c;


//            if (a<=2) {
//                System.out.println(1);
//
//            }
//            else {
//                System.out.println(b);
//            }
            System.out.println(a);
            System.out.println(b);
            System.out.print(b+" ");
        }
//            int f0=0;
//            int f1=1;
//            int fn=fn-1+fn-2;






    }
}
