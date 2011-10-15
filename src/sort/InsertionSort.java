package sort;

public class InsertionSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        insertion(test);
    }

    /**
     * ���������㷨���ԣ�
     * ����ֵ���е�ǰ2��ֵ�����ڱ�Ҫʱ�������ǡ�
     * �������ǰ2��ֵ������ģ����ʵ�λ�ò���ֵ�еĵ�����ֵ��
     * Ȼ���������ǰ3��ֵ������ģ����ʵ�λ�ò���ֵ�еĵ�4��ֵ��
     * ÿ����һ�β�������������Ӽ��е���ֵ����������1��
     * �ظ��ù��̣�ֱ��ֵ���е�����ֵ�����մ�������Ϊֹ��
     * ���������Ҫ�ƶ������е�����ֵ��
     * Ϊ�����Ԫ���ڳ��洢�ռ䡣
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
