import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.print("Number1: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Number2: ");
//        int num2 = scanner.nextInt();
//        System.out.print("Number3: ");
//        int num3 = scanner.nextInt();

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int sum = a + b + c;
//
//        System.out.println(sum);

//        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//
//        boolean flag = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                System.out.println("True");
//                flag = true;
//            }
//        }
//
//        if (!flag) {
//            System.out.println("False");
//        }
//    }
//}

// Задача: сложить 3 целых числа и вывести их сумму в консоль
//        1. Объявить объект сканнера
//        2. Считать из сканнера 3 значения типа int (scanner.nextInt())
//        3. Объявить переменную для суммы (тоже типа int)
//        4. Произвести сложение
//        5. Вывести результаты в консоль

//    Алгоритм Евклида
//
//    Формула НОД: НОД (a, b) = НОД (b, с), где с — остаток от деления a на b.
//
//        1 Большее число поделить на меньшее.
//        2 Меньшее число поделить на остаток, который получается после деления.
//        3 Первый остаток поделить на второй остаток.
//        4 Второй остаток поделить на третий и т. д.
//        5 Деление продолжается до тех пор, пока в остатке не получится нуль. Последний делитель и есть наибольший общий делитель.

        Scanner scanner = new Scanner(System.in);

//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        System.out.println(god(x, y));
//
//        publicn static int god(int x, int y);
//
//        while (b != 0) {
//        int a = Math.max((x, y));
//        int b = Math.max((x, y));
//        }
//    }

        public static void fork(int n) {
            if (n < 5) {
                System.out.println("number < 5");
            } else {
                for(int i = 0; i < n; i++) {
                    System.out.println(i + " ");
                }
            }
        }