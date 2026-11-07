import java.util.Scanner;

class Main {
    public static void secondLargest(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];

        int m = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (m < a[i]) {
                sm = m;
                m = a[i];
            } 
            else if (a[i] > sm && a[i] != m) {
                sm = a[i];
            }
        }

        if (sm == Integer.MIN_VALUE) {
            System.out.println("Second largest does not exist");
        } else {
            System.out.println(sm);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        secondLargest(n);
    }
}
