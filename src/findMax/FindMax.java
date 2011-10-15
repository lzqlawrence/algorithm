package findMax;

public class FindMax {

    public void aa() {
       synchronized (this) {
           
       }
    }

    public static void main(String... args) {
        int[] intArray = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        findMaxInt(intArray);
    }

    private static void findMaxInt(int[] intArray) {
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("max--" + max);
    }
}
