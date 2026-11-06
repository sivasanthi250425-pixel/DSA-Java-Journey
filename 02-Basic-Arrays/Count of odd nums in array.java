import java.util.Scanner;
class Main {

         public static void odd(int n){
      
         Scanner sc=new Scanner(System.in);


        int[] a=new int[n];
        int c=0;

        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
           
        }

        for(int i=0;i<n;i++){
            if (a[i]%2!=0){
                 c+=1;
 }
        }  System.out.println("count of odd nums:" +c);

         }
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        Main s=new Main();
s.odd(n);            
    }
}.count of odd nums in array?
