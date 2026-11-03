
import java.util.Scanner;

class Main {

    static void rev(long n) {
        long r = 0;
        long o = n;

        while (n > 0) {
            long d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }

       System.out.println("Reverse:"+r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
rev(n);
      
    }
}
