import java.util.*;
import static java.lang.Math.*;

public class prepinsta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        // System.out.println("enter a second number");
        // int number1=sc.nextInt();
        // System.out.print("enter a string");
        // String str=sc.nextLine();
        // HCF(number, number1);

        // HCF(number, number1);
        // LCM(number, number1);
        // binarytodecimal(number);
        // octaltodecimal(number);
        // Hexadecimal(str);
        // decimaltobinary(number);
        // DEcimaltooctal(214);
        // binarytooctal(number);
        // octaltobinary(number);
        // findquadrant(number, number1);
        // Permutations(number, number1);
        // maximumnumberofhandshaking(number);
        // addfractionsnumber(1, 3, 3, 9);
        // replacezerostointeger(number);
        // expressedsum(number);
        // calculateareaofcircle(number);
        // findprimeonetohundred(number);
        // findnumberofdigits(number);
        // convertgivenumber(3465);
        Occurrencedigits(8800983,8);
    
    }

    // Program for find a H.C.F.
    public static void HCF(int number, int number1) {
        int hcf = 0;
        for (int i = 1; i <= number1 || i <= number; i++) {
            if (number % i == 0 && number1 % i == 0) {
                hcf = i;

            }
        }
        System.out.println("the hcf of number is " + hcf);

    }

    // Program for a LCM
    public static void LCM(int number, int number1) {
        int lcm = 0;
        int max = (number > number1) ? number : number1;
        for (int i = max; i <= number * number1; i = i + max) {
            if (i % number == 0 && i % number1 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM of these both number are " + lcm);
    }

    // Java program to convert Binary number to decimal number
    public static int binarytodecimal(int binarynumber) {
        int decimal = 0;
        int pow = 0;
        while (binarynumber > 0) {
            int temp = binarynumber % 10;
            decimal += temp * Math.pow(2, pow);
            binarynumber = binarynumber / 10;
            pow++;
        }
        // System.out.println("The decimal conversion is  " + decimal);
        return decimal;
    }

    // program for Octal to decimal
    public static int octaltodecimal(int ocatalnumber) {
        int decimal = 0;
        int pow = 0;
        while (ocatalnumber > 0) {
            int temp = ocatalnumber % 10;
            decimal += temp * Math.pow(8, pow);
            ocatalnumber = ocatalnumber / 10;
            pow++;

        }
        // System.out.println("The decimal number conversion is " + decimal);
        return decimal;
    }

    // Program for Hexadecimal to Decimal
    public static void Hexadecimal(String Hexdecimal) {
        String digithex = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < Hexdecimal.length(); i++) {
            char c = Hexdecimal.charAt(i);
            int d = digithex.indexOf(c);
            val = val * 16 + d;
        }
        System.out.println("The conversion of hexadecimal form is " + val);

    }

    // Program for Decimal To Binary Conversion
    public static int decimaltobinary(int number) {
        
        int binarynumber[] = new int[20];
        int i = 0;
        while (number > 0) {
            binarynumber[i] = number % 2;
            number = number / 2;
            
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binarynumber[j]);
            
        }
        return binarynumber[i];
        


    }
    //Program for Decimal to octal
    public static void DEcimaltooctal(int number){
        int octal[]=new int [20];
        int i=0;
        while(number>0){
            octal[i]=number%8;
            number=number/8;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(octal[j]);

        }
    }
         
            
        
        public static void binarytooctal(int number) {
          int decimal=  binarytodecimal(number);
          DEcimaltooctal(decimal);

        
            
        }
        public static void octaltobinary(int number) {
            int decimal=octaltodecimal(number);
        decimaltobinary(decimal);

            
        }
        //Java program to find out the quadrant in which the given co-ordinate lie
        public static void findquadrant(int x,int y) {
            if(x>0 && y>0){
                System.out.println("The x and y is in first quadrant");
            }
            else if(x<0 && y>0){
                System.out.println("The x and y is in second quadrant");  
            }
            else if(x<0 && y<0){
                System.out.println("The x and y is in third quadrant");  
            }
            else if(x>0 && y<0){
                System.out.println("The x and y is in fourth quadrant");  
            }
            else if(x==0 && y==0){
                System.out.println("The number is a origin");  
            }
            else if(x==0 && y!=0){
                System.out.println("y-axis");  
            }
            else if(x!=0 && y==0){
                System.out.println("x-axis");  
            }
            
            
        }
        //this a helper program for permutation
        public static int factorial(int number){
            int res=1;
            //base condition
            if(number==1 || number==0){
              return 1;  
        
            }
            else{
                for(int i=1;i<=number;i++){
                    res=res*i;
                }
                return res;
            }
        
        }
        //Permutations in which n people can occupy r seats in a classroom in java
        public static void Permutations (int student,int seat) {
            int r=student-seat;
           int fact1=factorial(student);
           int fact2=factorial(r);
           int Permutations=fact1/fact2;
           System.out.println(Permutations);    
        }
        //Maximum number of handshakes in java
        public static void maximumnumberofhandshaking(int number) {
            int maximum=((number-1)*number)/2;
            System.out.println("THe maximum total number of handshaking is "+ maximum);
        }
        //Program for to add two fractions number
        public static void addfractionsnumber(int num1,int denum1,int num2,int denum2){
             int LCM; 
             int multinum1;
             int multinum2;
             int multinum3;
             int x;

            //base condition
            if(denum1==0 || denum2==0){
                System.out.println("This fraction addition is undifined");
            }
            else if(num1==0){
                System.out.println(num2 + "/" + denum2);
            }
            else if(num2==0){
                System.out.println(num1 +" / "+denum1);
            }
            else{
                LCM=denum1*denum2;
                multinum1=denum2*num1;
                multinum2=denum1*num2;
                multinum3=multinum1+multinum2;
                if(multinum3>LCM){
                    x=multinum3;

                }
                else{
                    x=LCM;
                }
                for(int i=1;i<=x;i++){
                    if(LCM%i==0 && multinum3%i==0){
                        LCM=LCM/i;
                        multinum3=multinum3/i;

                    }
                    
                }
                System.out.println(multinum3+"/" +LCM);
            }    
        }
        // Program for Replace all 0’s with 1 in a given integer using Java
        public static void replacezerostointeger(int number){
            String str=Integer.toString(number);
            int len=str.length();
            String str1="";
            for(int i=0;i<len;i++){
                if(str.charAt(i)=='0'){
                    str1=str1+'1';
                }
                else{
                    str1=str1+str.charAt(i);
                }
            }
            System.out.println(str1);

        }
        public static boolean primeornot(int number){
            int count=0;
            if(number==0 || number==1){
                return false;
            }
            else{
                for(int i=2;i<number;i++){
                    if(number%i==0){
                    count++;
                    }
                }
            }
            if(count>0){
                return false;
    
            }
            else{
                return true;
            }
        }
        //Can a number be expressed as a sum of two prime numbers using Java?
        public static void expressedsum(int number){
            for(int i=2;i<=number/2;i++){
                if(primeornot(i)==true){
                    if(primeornot(number-i)==true){
                        System.out.println(i+"+"+ (number-i)+ " " +"="+number);
                    }
                }
            }

        }

        //calculate area of circle
        public static void calculateareaofcircle(int radius) {
            float areaofcircle=(float) (3.14*radius*radius);
            System.out.println("The area of circle is "+ areaofcircle );

            
        }
        //Find the prime numbers between 1 to 100
        public static void findprimeonetohundred(int number) {
            for(int i=1;i<=number;i++){
                if(primeornot(i)==true){
                    System.out.print(i+" ,");
                }

            }
            
        }
        //Java Code to find number of digits in an integer
        public static void findnumberofdigits(int number){
            int count=0;
            while(number!=0){
                int res=number%10;
                count++;
                number=number/10;

            }
            System.out.println("The number of digits is "+ count);
        }
        //This a helper function for convert a number to words
        private static String numbertowords(int number) {
            String word="";
            String[] untiarray={"Zero","one","two","three","four","five",
            "six","seven","eight","nine","ten","eleven","twelve","thirteen",
            "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
            };
            String[] tensarray={"Zero","ten","twenty","thirty","fourty",
            "fifty","sixty","seventy","eighty","ninety",

            };
            if(number==0){
               return "Zero";

            }
            if(number<0){
                String number1=""+number;
                number1=number1.substring(1);
                return "Minus "+ numbertowords(Integer.parseInt(number1));

            }
            if((number/1000000)>0){
                word=word+numbertowords(number/1000000)+" Millon";
                number=number%1000000;
            }
            if((number/1000)>0){
                word=word+numbertowords(number/1000)+" Thousand";
                number=number%1000;
            }
            if((number/100)>0){
                word=word+numbertowords(number/1000)+" Hundred";
                number=number%1000;
            }
            if(number>0){
                if(number<20){
                    word=word+ " " +untiarray[number];
                }
                else{
                    word=word+tensarray[number/10];
                    if((number%10)>0){
                        word=word+" - "+untiarray[number%10];

                    }
                }
            }
            return word;


            
        }
        //Program to convert a given number to words
        public static void convertgivenumber(int number){
           if(number==0){
            System.out.println("Zero");
           }
           else{
            System.out.println("Number in words is a "+ numbertowords(number));
           }
        }
       //Finding Roots of a quadratic equation in Java
       public static void quadraticequation(int a,int b,int c){
        if(a==0){
            System.out.println("invalid");
            return;
        }
        int d = b * b - 4 * a * c;
        double sqrt_val = sqrt(abs(d));
        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"+ (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex");
 
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
        }
    }
    //Occurrence of a digit in a given number using Java
    public static void Occurrencedigits(int number,int repeateno){
        int count=0;
        while(number!=0){
            int rem=number%10;
            if(rem==repeateno){
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }
    //Finding number of integers which has exactly X divisors
    

        

    }

