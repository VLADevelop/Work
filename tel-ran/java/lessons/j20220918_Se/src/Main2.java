import java.util.Scanner;

public class Main2 {

    /*Есть переменная String и её значение мы получаем
    с клавиатуры с помощью объекта класса Scanner.
    Проверим эту переменную через switch на такие значения:
    one - выводим на консоль "1", two - выводим на консоль "2",
    three - выводим на консоль "3"
    в инном случае выводим "other number"*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            default:
                System.out.println("other number");

        }
    }
}
