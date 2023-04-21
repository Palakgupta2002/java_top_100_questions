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
    // invertedhalfdiamondstar( n);
    // daimondpattern(n);
    // basicsqurepattern(n);
    // basicsqurepatternincrement(n);
    // internalvarsitypattern( n);
    // Righttrianglenumberpattern(n);
    // invertRighttrianglenumberpattern(n);
    // basicRighttrianglenumberpattern(n);
    // incrementtrianglepattern( n);
    // incrementtriangleinitialised( n);
    //incrementdiamondpattern(n);
    // incrementingsquard(n);
    // invertedincrementsquard( n);
    // incrementingsquardstar(n);
    incrementingsquardnumber( n);

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
            
            System.out.println("");
            

        }
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
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                if(i%2!=0){
                System.out.print("*");
                }
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
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            if(i%2!=0){
            System.out.print(" *");
            }
        }
        System.out.println(" ");
    }
   
    
  }
  //Print daimond pattern
  public static void daimondpattern(int n){
    for(int i=1;i<=n;i=i+1){
        for(int k=n;k>i;k--){
            System.out.print(" ");
        }
        for(int j=1;j<i*2;j++){
           
            System.out.print("*");
           
           
        }
        System.out.println(" ");
    }
    for(int i=n;i>=1;i=i-1){
        for(int k=n;k>i;k--){
            System.out.print(" ");
        }
        for(int j=1;j<i*2;j++){
           
            System.out.print("*");
           
           
        }
        System.out.println(" ");
    }
  }
  //Print Basic Square 1 Pattern
  public static void basicsqurepattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("1");
        }
        System.out.println("");
    }
  }
  //print Basic Square incrementing Pattern
  public static void basicsqurepatternincrement(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(i);
        }
        System.out.println("");
    }
  }
  //Print Internal varsity square Pattern
  public static void internalvarsitypattern(int n){
    int k=0;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || j==1 || j==n || i==n){
                System.out.print("3");
            }
            else{
                System.out.print(k);
            }
        
        }
        System.out.println("");
        k++;
    }

  }
  //Print Basic Right Triangle Number Pattern
  public static void Righttrianglenumberpattern(int n){
    int k=1;
    for (int i=1;i<=n;i++){
        for(int j=1;j<i;j++,k++){
            System.out.print(k);
        }
        System.out.println("");
    }
  }
  //print Basic Right Triangle Number Pattern (Inverted)
  public static void invertRighttrianglenumberpattern(int n){
    int k=n*2;
    for (int i=n;i>=1;i--){
        for(int j=1;j<i;j++,k--){
            System.out.print(k);
        }
        System.out.println("");
    }

  }
  //print Basic incrementing Triangle Pattern initialised = 3
  public static void basicRighttrianglenumberpattern(int n){
    int k=n+2;
    for (int i=n;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(k);
        }
        k--;
        System.out.println("");
    }

  }
  //Print Basic incrementing Triangle Pattern(Inverted) initialised = 3 Checkout code for this program –
  public static void incrementtrianglepattern(int n) {
    int k=n/2+1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(k);
        }
        k++;
        System.out.println("");
    }
    
  }
  //Print Basic double incrementing Triangle Pattern initialised = 3 Checkout code for this program –
  public static void incrementtriangleinitialised(int n) {
    int k=n/2+1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(k);
            k++;
        }
        System.out.println("");
    }
    
  }
  //Print Basic incrementing Diamond Pattern(Inverted) initialised = 3
  public static void incrementdiamondpattern(int n) {
    int p=n/2+1;
    for(int i=1;i<n;i++){
        for(int k=n-1;k>i;k--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print(p);
            p++;
        }
        System.out.println("");
    }
    int r=n+1;
    for(int i=n-2;i>=0;i--){
        for(int k=n-1;k>i;k--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print(r);
            r--;
        }
        System.out.println("");
    }
    
  }
  // Print Basic incrementing Squared Number-Star Pattern 
  public static void incrementingsquard(int n){
    int a=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print((a++)+"*");
        }
        System.out.println(a++);
    }
  }
  // Print Basic incrementing inverted Squared Number-Star Pattern
  public static void invertedincrementsquard(int n) {
    int a=n*n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<n;j++){
            System.out.print((a--)+"*");
        }
        System.out.println(a--);
    }
}
// }
// Basic incrementing Squared Number-Star Pattern + Basic incrementing inverted Squared Number-Star Pattern (alternate)
public static void incrementingsquardstar(int n) {
    int a=1;
    int t;
    for(int i=1;i<n;i++){
       
          if(i%2==0){
            t=a+n;
          for(int j=1;j<n;j++){
            System.out.print((t++)+"*");
          }
            System.out.println(t++);
          } 
          else{
            for(int j=1;j<n;j++){
                System.out.print((a++)+"*");
            }
                System.out.println(a++);

          } 
        }
       
    }
    public static void incrementingsquardnumber(int n){
        int i,j,m=1;
        for(i=1; i<=n-1; i++)
        {
        if(i!=2)
        {
        for(j=1; j<n; j++){
        System.out.print((m++)+"*");
        }
        System.out.print(m++);
        System.out.println();
        }
        else {
        m = m+n;
        for(j=1; j<n; j++){
        System.out.print((m++)+"*");
        }
        System.out.print(m++);
        System.out.println();
        }
        }
        for(i=n+1 ;i<(n+n);i++){
        System.out.print(i+"*");
        }
        System.out.print(i);
        System.out.println();
        }
}

    
    
    





