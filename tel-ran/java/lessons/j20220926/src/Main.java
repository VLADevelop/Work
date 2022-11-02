// Задача №1. Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5



//* public class Main {
//    public static void main(String[] args) {

//        int arr[] = {51, 5515, 51, -20};


 //       System.out.println("Hello world!");
//    }

//    public static void printInArray(int[]arr){
//       for (int i=o; i < arr.length; i++) {
 //           System.out.println("arr[%2d]=5d  ",i,arr[i]);
 //           if (i%5==0&&i!=0){
 //               System.out.println();
 //           }
 //       }
//    }
/// }

// Задача №2. Дан массив строк. Реализовать метод, который возвращает индекс самой длинной строки в данном массиве.      Например: {“qwe”,”axcvbn”,”qwertyuio”,”qas”} -> 2

//    public static int getIndexOfLongesString(String[] strings){
//  int indexMax=0;
 //       for
        }


// Задача №3
                {4, 6, 8, 9, 1, 5, 3}

    public class Main {
        public static void main(String[] args) {

        }

        public static int getSecondMin(int[] arr ){
            int min1= arr[0];
            int min2= arr[0];

            for (int i=0; i < arr.lengh ; i++) {
                if (min1>arr[i]){
                    min2+min1;
                    min1=arr[i];
                }
            }

            System.out.println(min1);
            return  min2;

        }
    }