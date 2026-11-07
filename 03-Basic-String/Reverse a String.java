import java.util.Scanner;

class Main {
    public static void rev(String s) {
        String h = "";

        for(int i = s.length()-1; i >= 0; i--) {
            h = h + s.charAt(i);
        }

        System.out.println("Reverse: " + h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        rev(s);
    }
}
