import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str ="Hello Java!";
        System.out.println(str);

        System.out.println(str.length());  //длинна строки
        System.out.println(str.toLowerCase());
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.charAt(1));

        int index=0;  //0.......<str.length()
        while (index<str.length()){
            System.out.println(str.charAt(index));
        }


    }
}