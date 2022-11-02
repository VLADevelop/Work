public class Homework {
    public int maximum (int[] array) {
        int a = array[0];
        for(int i=0;i<array.length;i++) {

            if(array[i] > a) {
                a = array[i];

            }

        }

        return a;


    }

    public int mimimum (int[] array) {
        int a = array[0];
        for(int i=0;i<array.length;i++) {

            if(array[i] < a) {
                a = array[i];

            }

        }

        return a;


    }

    public int result(int[] array) {
        return maximum(array) - mimimum(array);
    }
}
