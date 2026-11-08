import java.util.*;

class Main {
    public static int lowestFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            if (map.get(key) < minFreq) {
                minFreq = map.get(key);
            }
        }

        return minFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = lowestFrequency(arr);
        System.out.println(result);
    }
}
