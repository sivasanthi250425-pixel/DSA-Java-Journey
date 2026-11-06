import java.util.Scanner;
class Main {

         public static void sort(int n){
      
         Scanner sc=new Scanner(System.in);

boolean sorted=true;
        int[] a=new int[n];
        int c=0;

        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
           
        }

        for(int i=0;i<n-1;i++){
        
            if (a[i]>a[i+1]){
            sorted =false;
                  break;
            }      }
            if(sorted){
                  System.out.println("sorted");
              
            }
             else{
                 System.out.println("Not sorted");
             }
         
        }    

         
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        Main s=new Main();
s.sort(n);            
    }
}
