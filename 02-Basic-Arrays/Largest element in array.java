import java.util.Scanner;

class Main {
    public static void largest(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];

        int m = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (m < a[i]) {
                m = a[i];
            }
        }

        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        largest(n);
    }
}
