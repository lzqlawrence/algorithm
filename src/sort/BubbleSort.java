package sort;

public class BubbleSort {
    public static void main(String... args) {
        int[] test = {2, 11, 3, 12, 6, 23, 1, 4, 7, 10, 20};
        bubble(test);
    }

    /**
     * ð�������㷨��һ���Բ��ԣ���������ֵ�У��Ƚ�����Ԫ�أ�������ߵ���Դ��򲻶ԣ��򽻻����ǣ�
     * ���������ֵ����ˮ��һ�����ƶ���ֵ�е����һ��λ���ϣ�
     * ��Ҳ������������������ֵ���к��ʵ�λ�á�
     * Ȼ���ٴ�����ֵ�У����ڶ����ֵ�ƶ��������ڶ���λ���ϣ�
     * �ظ��ù��̣�ֱ��������Ԫ���ƶ�����ȷ��λ���ϡ�
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
