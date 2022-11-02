package com.vlad.bot;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate dateFrom = LocalDate.of(2022, 9, 25);
        LocalDate dateTo = LocalDate.of(2022, 10, 5);
        String descr = "Text Description";

        // 02.10.2022

        String str;
        while (true) {
            System.out.println("введите дату в формате число. месяц. год");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();


            if (str.matches("[0-9]+.[0-9]+.[0-9]+")){
                System.out.println("дата введина коректна");
                break;
            }
        }

        String[] date = str.split("\\.");


        LocalDate dateTest = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));

        Offers suggestion = new Offers(dateFrom, dateTo, descr);
        System.out.println("Актуально ли предложение? " + suggestion.checkExipired(dateTest));
        if (suggestion.checkExipired(dateTest)) {
            System.out.println(suggestion.description);
        }

    }

}

// Дз:
//        - String метод split()
//        - String метод matches ();
//        - Сделать так чтобы наш код работал теперь для создания LocalDate с той строки которую мы делали в цикле,
//            т.е. нужно её вынести в более глобальную область видимости