package sort;

public class SelectionSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        selection(test);
    }

    /**
     * 选择排序算法的一般策略：
     * 搜索整个值列，以找到最小值。将该值与值列中第一个位置上的值进行交换。
     * 搜索剩下的值列（第一个除外），以找到其中的最小值，然后将其与值列中第二个位置上的值进行交换。
     * 对值列中的每个位置重复该过程。在算法结束时，就完成了对值列的排序。
     *
     * @param intArray
     */
    private static void selection(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[minIndex] > intArray[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = intArray[i];
                intArray[i] = intArray[minIndex];
                intArray[minIndex] = temp;
            }
        }
        print(intArray);
    }

    private static void print(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
