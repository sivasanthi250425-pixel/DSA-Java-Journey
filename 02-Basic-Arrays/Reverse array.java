import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void reverse(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverse(n);
    }
}
