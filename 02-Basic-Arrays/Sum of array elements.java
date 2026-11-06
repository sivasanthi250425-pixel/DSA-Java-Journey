import java.util.Scanner;
class Main {

         public static void sum(int n){
      
         Scanner sc=new Scanner(System.in);


        int[] a=new int[n];
        int s=0;

        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
           
        }

        for(int i=0;i<n;i++){
            s+=a[i];
           
        }  System.out.println("SUM:" +s);

         }
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        Main s=new Main();
s.sum(n);            
    }
}
