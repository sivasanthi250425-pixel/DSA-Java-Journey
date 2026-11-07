import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void anagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        anagram(s1, s2);
    }
}
