import java.util.*;
public class prepinstapattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        // squrepattern(n);
        // hollowsqurepattern(n);
        // rhombusstarpattern(n);
        // mirroredrhombustar(n);
        // Trianglestarpattern(n);
        // pyramidstarpattern(n);
        hollowpyramidstarpattern(n);

    }
    // print Square Star Pattern


    public static void squrepattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
    //print hollow squre pattern
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
    //print Rhombus Star Pattern
    public static void rhombusstarpattern(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
                for(int k=0;k<n;k++){
                    System.out.print("*");
                }
            
            System.out.println("");
            

        }
    }
    //print Mirrored Rhombus Star Pattern
    public static void mirroredrhombustar(int n) {
        int k;
       for (int i=0;i<n;i++){
        for (k=n-1 ;k>i;k--){
            System.out.print(" ");
        }
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
    System.out.println(" ");

       } 
    }
    //print Triangle Star Pattern
    public static void Trianglestarpattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //print Pyramid Star Pattern
 public static void pyramidstarpattern(int n) {
    int k;
    for (int i=0;i<n;i++){
     for (k=n-1 ;k>i;k--){
         System.out.print(" ");
     }
     for(int j=0;j<i;j++){
         System.out.print(" *");
     }
 System.out.println(" ");

    } 
        
    }
    //print Hollow Pyramid Star Pattern
    public static  void hollowpyramidstarpattern(int n){
       


    }


    
}
