public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
         Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел. Числа заданы в виде переменных num1, num2, num3.
         */

        int num1 = -200;
        double num2 = 200;
        int num3 = 200;



            if (num1 >= num2) {
                if (num1 >= num3)
                    System.out.println("The largest number: " + num1);
                else
                    System.out.println("The largest number: " + num3);
            }



        }

    }
}