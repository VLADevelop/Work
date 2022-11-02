import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";

        // Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
        // то вывести надпись “Имя, явитесь в военкомат“,
        // где Имя - это имя, введенное ранее с клавиатуры.

                Scanner keyboard = new Scanner(System.in);
                String name = keyboard.nextLine();
                int age = keyboard.nextInt();

                if (age > 18 && age <= 28)
                    System.out.println(name + militaryCommissar);

    }
}