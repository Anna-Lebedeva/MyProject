package com.company;

public class lesson16 {
    public static void main(String[] args) {

  System.out.println(factorial23(6));
    }
    static int factorial23(int x){

        if (x == 1)


        {
            return 3;
        }

        System.out.println(x);
        return x*factorial23(x-1);  // 6*5=30; 30*4=120; 120*3=360; 360*2=720; 720*3=2160;
    }

}
