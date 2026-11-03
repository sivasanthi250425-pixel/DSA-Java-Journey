import java.util.Scanner;

class Main {

    static boolean palin(long n) {
        long r = 0;
        long o = n;

        while (n > 0) {
            long d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }

        return r == o;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (palin(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
