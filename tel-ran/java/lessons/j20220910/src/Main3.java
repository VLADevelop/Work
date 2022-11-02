public class Main3 {
    public static void main(String[] args) {

        //

        int x = 0;
        int y = 8;

        if (x > 0 && y > 0) {
            System.out.println(1);

        }
        if (x < 0 && y < 0) {
            System.out.println(3);
        }

        if (x < 0 && y > 0) {
            System.out.println(4);
        }

        if (x > 0 && y < 0) {
            System.out.println(2);
        }

        if (x == 0 || y == 0) {
            System.out.println("na osi");
        }

        if (x > 0 && y > 0) {
            System.out.println(1);

        } else if (x < 0 && y < 0) {
            System.out.println(3);

        } else if (x < 0 && y > 0) {
            System.out.println(4);

        } else if (x > 0 && y < 0) {
            System.out.println(2);

        } else if (x == 0 || y == 0) {


        }


    }
}