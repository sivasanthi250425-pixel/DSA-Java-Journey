import java.util.*;

class Main {
    public static int frequencySum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = 0;

        for (int key : map.keySet()) {
            if (map.get(key) < minFreq) {
                minFreq = map.get(key);
            }

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
            }
        }

        return minFreq + maxFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = frequencySum(arr);
        System.out.println(result);
    }
}
