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
        // hollowpyramidstarpattern(n);
        // invertedpyramid(n);
    //    invertedhollowpyramid(n);
    // halfdiamondstar(n);
    // hollowpyramidstarpattern(n);
    invertedhalfdiamondstar( n);

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
        int i, j, k = 0; 
        for (i = 1; i <= n; i++)  
        { 
            
            for (j = i; j < n; j++)  
                System.out.print(" "); 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
                ; 
            } 
            k = 0; 
            System.out.println();  
        } 
        // print last row 
        for (i = 0; i < 2 * n - 1; i++)  
            System.out.print("*"); 
        
    } 
    

    //  Print Inverted Pyramid Star Pattern
    public static void invertedpyramid(int n){
        for(int i=n;i>0;i--){
            for(int k=0;k<n-i;k++){
System.out.print(" ");

            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }   
}
//Print Inverted Hollow Pyramid Star Pattern
public static void invertedhollowpyramid(int n) {
    for(int i=n;i>0;i--)
		{
		 for(int j=1;j<=n-i;j++)
		  System.out.print(" ");
		 if(i==1 || i==n)
		 for(int j=1;j<=i*2-1;j++)
		  System.out.print("*");
		else
		 for(int j=1;j<=i*2-1;j++)
		if(j==1 || j==i*2-1)
		  System.out.print("*");
		else
		  System.out.print(" ");
		System.out.println();
     }
  }
  //Print Half Diamond Star Pattern
  public static void halfdiamondstar(int n) {
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=n-2;i>=0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
  }
  // Print Half Diamond Star Pattern Inverted
  public static void invertedhalfdiamondstar(int n) {
    for(int i=1;i<n;i++){
        for(int k=n-1;k>i;k--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=n-2;i>=0;i--){
        for(int k=n-1;k>i;k--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
  }
  //Print Diamond Star Pattern
  public static void Diamondstarpattern(int n) {
   
    
  }
    
}



