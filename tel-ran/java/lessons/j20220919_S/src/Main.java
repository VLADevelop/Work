
        /* Tasks Java - 16.09.2022
Написать метод,
возвращающий целое число
равное двойной строки
принимаемой в качестве аргумента метода.

Пример: hello -> 10
 */

        public class Main {
            public static void main(String[] args) {
                String str = "hello";
                System.out.println(str + " -> " + doubleLongOfString(str));
            }

            private static int doubleLongOfString(String str) {
                int x = str.length() * 2;
                return x;
    }
}

