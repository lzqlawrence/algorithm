package sort;

public class InsertionSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        insertion(test);
    }

    /**
     * 插入排序算法策略：
     * 排序值列中的前2个值，并在必要时交换它们。
     * 在相对于前2个值（有序的）的适当位置插入值列的第三个值。
     * 然后，在相对于前3个值（有序的）的适当位置插入值列的第4个值。
     * 每进行一次插入操作，有序子集中的数值个数将递增1。
     * 重复该过程，直至值列中的所有值都按照次序排列为止。
     * 插入过程需要移动数组中的其他值，
     * 为插入的元素腾出存储空间。
     */
    private static void insertion(int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            int key = intArray[i];
            int pos = i;
            while (pos > 0 && intArray[pos - 1] > key) {
                intArray[pos] = intArray[pos - 1];
                pos--;
            }
            intArray[pos] = key;
        }
        print(intArray);
    }

    private static void print(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

}
