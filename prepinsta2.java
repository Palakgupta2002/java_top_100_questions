import java . util.*;
public class prepinsta2 {
    public static void main (String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int number=sc.nextInt();
    System.out.println("enter a second number");
    int number1=sc.nextInt();
    // HCF(number, number1);

    HCF(number, number1);

    }
    //Program for find a H.C.F. 
    public static void HCF(int number,int number1) {
        int hcf=0;
        for(int i=1;i<=number1 || i<=number;i++)
        {
            if(number%i ==0 && number1 %i==0){
                hcf=i;


            }
        }
        System.out.println("the hcf of number is " + hcf);
        
    }
    
}
