import java.util.Scanner;

import javax.xml.stream.events.Characters;
public class prepinsta5 {
   
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        // checkvowelcons('k');
        calculatingasciivalue('t');
        // ischaracter('o');
}
    private static void checkvowelcons(char str) {
        if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u' || str=='A' ||str=='E' || str=='I' || str=='O' || str=='U'){
            System.out.println("the word is vowel");
           }
        
           else{
            System.out.println("The word is constant");
           }
    }
    public static void checkvowelconst(char str) {
        
       if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u' || str=='A' ||str=='E' || str=='I' || str=='O' || str=='U'){
        System.out.println("the word is vowel");
       }
    
       else{
        System.out.println("The word is constant");
       }
}
//Check whether a character is a alphabet or not
public  static void ischaracter(char ch) {
   char ch2= Character.toUpperCase(ch);
    int t=ch2;
    
   if(t>65 && t<90){
System.out.println("The entire character is alphabet");
   }
   else{
    System.out.println("the entire charachter is not alphabet");
   }
    
}
//Java Program for Calculating ASCII value of a character
public static void calculatingasciivalue(char ch){
    int ASCII=ch;
    System.out.println("The Ascii value of"+ch+"character is "+ASCII);
}
}
