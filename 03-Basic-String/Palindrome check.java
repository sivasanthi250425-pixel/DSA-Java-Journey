import java.util.Scanner;

class Main {
    public static void palindrome(String s) {
        String h = "";

        for(int i = s.length()-1; i >= 0; i--) {
            h = h + s.charAt(i);
        }

        if(h.equals(s)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindrome(s);
    }
}
