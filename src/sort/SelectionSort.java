package sort;

public class SelectionSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        selection(test);
    }

    /**
     * ѡ�������㷨��һ����ԣ�
     * ��������ֵ�У����ҵ���Сֵ������ֵ��ֵ���е�һ��λ���ϵ�ֵ���н�����
     * ����ʣ�µ�ֵ�У���һ�����⣩�����ҵ����е���Сֵ��Ȼ������ֵ���еڶ���λ���ϵ�ֵ���н�����
     * ��ֵ���е�ÿ��λ���ظ��ù��̡����㷨����ʱ��������˶�ֵ�е�����
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
