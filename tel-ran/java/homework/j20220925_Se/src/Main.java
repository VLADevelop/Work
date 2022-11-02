// Вывести на консоль числа от 0 до 100 кратные 2

public class Main{
    public static void main(String[] args) {

        for(int i = 2; i<=100; i = i + 2){
            System.out.println(i);
        }

// Вывести на консоль числа от 100 до 0 кратные 3

        for(int i = 100; i>=0; i = i - 3){
            System.out.println(i);

        }

// Вывести на консоль все элементы масива

        int[] masiv = {1, 5, 8, 11, 45};

        for (int i =0; i< masiv.length; i++ ){
            System.out.println(masiv[i]);

        }

// Вывести на консоль все элементы масива в обратном порядке

        for (int i = masiv.length - 1; i >=0; i--){
            System.out.println(masiv[i]);
        }

    }


}