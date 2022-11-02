/* 1 Задача
Дан масив int.
Реализовать метод,
который считает сумму положительных элементов массива:
{3, 2, -1, 5, -3} -> 10
 */

/*public class Main {
    public static void main(String[] args) {

    }

    public static long getSumOfArrey (int[] arr) {
        return

    }
}
*/

/* 2 Задача
Реализовать метод, который создаёт массив числами int в диапозоне от minValue до maxValue.
10 15 -> {10, 11, 12, 13, 14}
  -7   -9
  maxValue-minValue
 */

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int[] getIntArray(int minValue, int maxValue) {
        int[] result= new int[maxValue-minValue];

        int index=0;
        for (int i = minValue; i < maxValue; i++) {
            result[index] = 1;
            index+=1;
        }

        return result;
    }
}