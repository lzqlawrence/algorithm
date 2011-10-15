package sort;

public class BubbleSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        bubble(test);
    }

    /**
     * 冒泡排序算法的一般性策略：搜索整个值列，比较相邻元素，如果两者的相对次序不对，则交换它们，
     * 其结果是最大值“想水泡一样”移动到值列的最后一个位置上，
     * 这也是它在最终完成排序的值列中合适的位置。
     * 然后再次搜索值列，将第二大的值移动至倒数第二个位置上，
     * 重复该过程，直至将所有元素移动到正确的位置上。
     * @param intArray
     */
    private static void bubble(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray [j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
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
