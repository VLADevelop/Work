//Do your homework of 2 choices. The first task is easy, the second is more difficult. We wish you good luck!
//
// First level: Дан массив целых чисел ( не пустой) .
// Написать метод, возвращающий наибольший элемент  этого массива .
// { 5,2,9,1} -> 9
//
//Second level: Дан массив целых чисел ( не пустой) .
// Написать метод, возвращающий разницу между наибольшим
// и наименьшим  элементами  этого массива .
//{ 5,2,9,1} -> 8


public class Main {
    public static void main(String[] args) {
        int[] array = { 5,2,9,1};
        Homework hw = new Homework();
        hw.maximum (array);

        System.out.println(hw.maximum(array));
        System.out.println(hw.mimimum(array));
        System.out.println(hw.result(array));
    }
}