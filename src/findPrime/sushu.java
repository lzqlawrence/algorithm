package findPrime;

public class sushu {
    public static void main(String... args) {
        sushuTest2();
//        Sieve(100);
        System.out.println(Math.sqrt(5));
    }

    private static void sushuTest() {
        int i, j, k = 0;
        for (i = 1; i <= 10; i++) {
            for (j = 2; j <= i; j++) {
                System.out.println("1--j--" + j);
                if (i % j == 0) {
                    System.out.println("break--");
                    break;
                }
                System.out.println("2--j--" + j);
            }
            System.out.println("i--" + i + ",j--" + j);
            if (i == 1) {
                k++;
                System.out.println(i);
            }
            if (j == i) {
                k++;
                System.out.println(i);
            }
        }
        System.out.println("count--" + k);
    }

    private static void sushuTest2() {
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            boolean isPrime = true;
            //or j < Math.sqrt(i)
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                k++;
                System.out.println(i);
            }
        }
        System.out.println("count--" + k);
    }

    //more efficiency
    private static void Sieve(int n) {
        boolean[] a = new boolean[n + 1];
        for (int i = 2; i <= n; i++) a[i] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i])
                for (int j = i; j * i <= n; j++) a[j * i] = false;
        }
        for (int i = 0; i <= n; i++) {
            if (a[i]) System.out.println(i);
        }
    }
}
