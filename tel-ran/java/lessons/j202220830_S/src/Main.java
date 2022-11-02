import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        colculet();
    }
    static void colculet(){
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Input a,b,c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int y=(b+a)*c;
        System.out.println ("y= " + y);

        System.out.println("Tel-ran");

        
    }
}
