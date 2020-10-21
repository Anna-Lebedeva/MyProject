package com.company;

public class lesson14 {
    public static void main(String[] args) {
        hello();
        welcome();
        sum('y',7);
        sum('5',4);
        display("Tom",23);
        variable_lenght(3,6,4,2,54);

    }
    static void hello (){
        System.out.println("Hello!");
    }
    static void welcome (){
        System.out.println("Welcome to java 10!");
    }
    static void sum (char x, int y){
        int z = x+y;
        System.out.println(z);
    }
    static void display(String name, int age){
        System.out.println("imya "+name+" vozrast "+age);
    }

    static void variable_lenght(int ...nums){
        int i = 0;
        for (int nazv_perem: nums){
            i+=nazv_perem;

        }
        System.out.println(i);
    }
}
