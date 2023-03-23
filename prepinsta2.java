import java . util.*;
public class prepinsta2 {
    public static void main (String []args) {
    Scanner sc=new Scanner(System.in);
    // System.out.println("enter a number");
    // int number=sc.nextInt();
    // System.out.println("enter a second number");
    // int number1=sc.nextInt();
    System.out.print("enter a string");
    String str=sc.nextLine();
    // HCF(number, number1);

    // HCF(number, number1);
    // LCM(number, number1);
    // binarytodecimal(number);
    // octaltodecimal(number);
    Hexadecimal(str);

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
    //Program for a LCM
    public static void LCM(int number,int number1){
        int lcm=0;
        int max=(number>number1)?number:number1;
        for (int i=max;i<=number*number1;i=i+max){
            if(i%number==0 && i%number1==0){
                lcm=i;
                break;
            }
        }
        System.out.println("The LCM of these both number are "+lcm);
    }
    //Java program to convert Binary number to decimal number
    public static void binarytodecimal(int binarynumber) {
        int decimal=0;
        int pow=0;
        while(binarynumber>0){
           int temp=binarynumber%10;
           decimal+=temp*Math.pow(2,pow); 
           binarynumber=binarynumber/10;
           pow++;   
        }
        System.out.println("The decimal conversion is  "+decimal); 
    }
    //program for Octal to decimal
    public static void octaltodecimal(int ocatalnumber){
        int decimal=0;
        int pow=0;
        while(ocatalnumber>0){
            int temp=ocatalnumber%10;
            decimal+=temp*Math.pow(8,pow);
            ocatalnumber=ocatalnumber/10;
            pow++;

        }
        System.out.println("The decimal number conversion is "+decimal);
    }
    //Program for Hexadecimal to Decimal
    public static void Hexadecimal(String Hexdecimal) {
        String digithex="0123456789ABCDEF";
        int val=0;
        for(int i=0;i<Hexdecimal.length();i++)
        {
            char c= Hexdecimal.charAt(i);
            int d=digithex.indexOf(c);
            val=val*16+d;
        }
        System.out.println("The conversion of hexadecimal form is "+val);

        
    }
   
}
