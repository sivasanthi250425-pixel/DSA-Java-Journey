import java.util.*;

class Main {
    public static int secondhighestFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
int maxFreq2=0;
        int maxFreq = 0;
int ans=0;
        int ans2=0;
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq2=maxFreq;
                maxFreq = map.get(key);
                  ans2=ans;
                ans=key;
              
            }
            else if(map.get(key)>maxFreq2 &&map.get(key)< maxFreq){
                maxFreq2=map.get(key);
                ans2=key;
            }
        }

        return ans2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = secondhighestFrequency(arr);
        System.out.println(result);
    }
}
