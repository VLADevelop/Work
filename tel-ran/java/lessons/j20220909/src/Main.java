public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println("Sum = a + b ->" + sum(5,5)); // 10
        int c = sum(1,2); // 3
        int d = min(10,8) + sum(1, 3); // 2 + 4 = 6
        System.out.println("c + d -> " + (c + d)); // 9
    }

    public static int sum (int a, int b) {
        return a + b;
    }
    public static int min (int a, int b) {
        return a - b;
    }
}