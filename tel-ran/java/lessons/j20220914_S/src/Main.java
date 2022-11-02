public class Main {
    public static void main(String[] args) {
        double j;
        double a=1, b=2;


        System.out.println("Sum = a + b ->" + sum(5,5)); // 10
        int c = sum(1,2); // 3
        int d = min(10,8) + sum(1, 3); // 2 + 4 = 6
        System.out.println("c + d -> " + (c + d)); // 9
        System.out.println ("del (1, 2) -> " + del (1, 2));
        System.out.println("umn (a*b)" + umn(1,2));
        j = a/b;
        System.out.println(j);
    }

    public static int sum (int a, int b) {
        return a + b;

    }
    public static int min (int a, int b) {
        return a - b;
    }

    public static int umn (int a, int b) {
        return a * b;

    }
    public static int del (int a, int b) {
        return a / b;
    }



}