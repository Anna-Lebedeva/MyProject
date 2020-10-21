package com.company;


import org.w3c.dom.ls.LSOutput;

public class lesson5 {
    public static void main(String[] args) {
        byte b = 7;//0000 0111
        short s = 7;//0000 0000 0000 0111
        //1000 0000 0000 0111
        int a1 = 2; //010
        int b1 = 5; //101
        System.out.println(a1&b1);
        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2&b2);
        System.out.println(a1|b1);
        int number = 45; // 0101101
        int key = 102; // ключ шифрования в двоичной  системе 1100110
        int encrypt = number^key;//1001011
        System.out.println("зашифрованное число"+encrypt);
        byte a =12;//1100
        System.out.println(~a); //1111 0011
        //1000 1101
        int decrypt = encrypt^key;
        System.out.println(decrypt);
    }

//    int a = 2;
//    int b = 5;
//    int result = b * 3 + 20 / 2 * a--; //5*3+20/2*2=15+20=35

}
