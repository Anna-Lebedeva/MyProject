package com.company;

public class lesson15 {
    public static void main(String[] args) {
        sum(3,4,5,3,23);
        System.out.println(num(3,4,5));
        System.out.println(dataTime(22));
        dateTime2(99);
//        System.out.println(sum(3,5,6));

//        System.out.println(sum(4.3,5.4));
        int x=sum(4,3);
        System.out.println(x-5);
//        int c-=5;

    }
    static int sum(int x, int y){

        int c = x + y;
        System.out.println(c);
        return x + y;

    }

    static void sum(int ...nums){
        int count=0;
        for (int n:nums){
            count+=n;

        }
        System.out.println(count);
    }

    static int num(int a, int b, int c){
        return a+b+c;
    }
    static String dataTime(int hour){
        if(hour<12){
            return "С добрым утром!";
        }
        else if(hour>=12&&hour<18){
            return "Добрый день!";
        }
        else if(hour>=18&&hour<=24){
            return "Добрый вечер!";
        }
        else {
            return "ничего не сработало";
        }
    }
    static void dateTime2(int hour){
        if(hour<12){
            System.out.println("С добрым утром!");
        }
        else if(hour>=12&&hour<18){
            System.out.println("Добрый день!");
        }
        else if(hour>=18&&hour<=24){
            System.out.println("Добрый вечер!");
        }
        else {
            return;
        }
    }

//    static int sum(int y, int x){
//        return x+y;
//    }
//    static double sum(double x, double y){
//        return x+y;
//    }
//    static int sum(int z, int q, int a){
//        return z+q+a;
//    }


    static double sum(double x, int y){

        return x + y;
    }
}
