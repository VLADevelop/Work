public class Main {
    public static void main(String[] args) {

        /* Есть переменная int и нам нужно проверить
        если она является одним из чисел 18, 19, 20, 21
        выводим на экран текст: "Привет молодеж",
        а в инном случае выводим текст "Ты старше чем молодеж"*/

        int a=100;

        switch (a){
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("Привет молодёж");
                break;
            default:
                System.out.println("Ты старше чем молодеж");


        }



    }
}