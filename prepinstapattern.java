import java.util.*;
public class prepinstapattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        // squrepattern(n);
        hollowsqurepattern(n);

    }
    // print Square Star Pattern


    public static void squrepattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void hollowsqurepattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){ 
                System.out.print("*");
                }
                else{
                    System.out.print(" ");  
                }
            }
            System.out.println("");
        }
    }
    
    
}
