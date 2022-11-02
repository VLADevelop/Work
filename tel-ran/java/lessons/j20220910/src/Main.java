import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ввести с клавиатуры температуру на улице.
        // Если температура меньше 0, вывести надпись “на улице холодно“,
        // иначе - вывести надпись “на улице тепло“.

                String cold = "на улице холодно";
                String warm = "на улице тепло";
                //напишите тут ваш код
                Scanner scanner = new Scanner(System.in);
                int console = scanner.nextInt();
                if (console < 0)
                {
                    System.out.println(cold);
                }else
                {
                    System.out.println(warm);
                }
    }
}