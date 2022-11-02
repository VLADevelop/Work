/*Создать новый проект и написать пограмму расчитывающущую, на сколько увеличиться площадь пицы
если её диаметр еличить на n

 */



public class Main {
    public static void main(String[] args) {
        int diameter1 =11;
        int n=6;
        int diameter2=n+diameter1;
        //double pi=3.14;
        double PI=Math.PI;

        double radius=diameter1/2.0;
        double radius2=diameter2/2.0;
        double arial= radius1*radius1*PI;

        System.out.println("The area of pizza with diameter " + diameter1 + " is " + area1 );



    }
}