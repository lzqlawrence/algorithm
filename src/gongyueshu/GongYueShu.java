package gongyueshu;

public class GongYueShu {
    public static void main(String... args) {
        int a = 12, b = 42;
        System.out.println(test(a, b));
    }

    private static int test(int a, int b) {
        if (b == 0) return a;
        return test(b, a%b);
    }

}
