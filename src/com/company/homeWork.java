package com.company;

import java.util.Scanner;


public class homeWork {
    public static void main(String[] args) {
        Scanner humanBio = new Scanner(System.in);
        System.out.println("Введите ваше ФИО:");
        String humanFio = humanBio.nextLine();

        System.out.println("В каком году вы родились?");
        String human_Rozh_Data = humanBio.nextLine();

        System.out.println("В каком городе вы родились? (написать в преложном падеже)");
        String humanRozh = humanBio.nextLine();

        System.out.println("В какой стране вы родились? (написать в именительном падеже)");
        String humanRozh1 = humanBio.nextLine();

        System.out.println("В каком году вы пошли в первый класс?");
        String humanClass = humanBio.nextLine();

        System.out.println("Введите ваш телефон:");
        String humanTel = humanBio.nextLine();

        System.out.println("Введите сегодняшнюю дату:");
        String humanData = humanBio.nextLine();

        System.out.println("Автобиография");
        System.out.println("Я, "+humanFio+", родилась в "+human_Rozh_Data+" году, в городе "+humanRozh+", "+humanRozh1+".");
        System.out.println("В "+humanClass+" пошла(ел) в 1 класс"+".");
        System.out.println("Моб. тел.: "+humanTel);
        System.out.println(humanData);
        humanBio.close();



//
//        String data = "17 сентября 2020 г";
//        System.out.println("            Автобиография");
//        System.out.println("Я, Лебедева Анна Кирилловна, родилась в 1998 году в г.Санкт-Петербурге, Россия");
//        System.out.println("В 2005 пошла в 1 класс, физико-математической школы №292 и музыкальной школы №4");
//        System.out.println("В 2014 поступила в лицей при СПБГУТ");
//        System.out.print("Моб.тел.:");
//        System.out.println(tel);
//        System.out.println(data);



    }

}
