import java.util.Scanner;

import javax.xml.stream.events.Characters;
public class prepinsta5 {
   
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter");
        // checkvowelcons('k');
        // calculatingasciivalue('t');
        // ischaracter('o');
        // findlength("Palak");
        // toggleachcharacter("Palak","");
        // countvowels("Palak Gupta");
        // removeconstant("Palak");
        // removevowel("Gupta");
        isPalindrome("palak");
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
//Java Program to find length of the string without using length function
 public static void findlength(String str) {
    System.out.println(str.length());  
}
//Java program to toggle each character in a string
public static void toggleachcharacter(String str,String str1) {
    for(int i=0;i<str.length();i++){
       if(Character.isUpperCase(str.charAt(i))){
       str1=str1+ Character.toLowerCase(str.charAt(i));
       }
       else{
        str1=str1+Character.toUpperCase(str.charAt(i));
       }
    }
    System.out.println(str1);
    
}
//Java program to count the number of vowels in a String
public static void countvowels(String str) {
    int count=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               count++;
        }
    }
    System.out.println(count);
    }
    //Java program to remove constant from a string
    public static void removeconstant(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            str1=str1+str.charAt(i);
               }
              
        }
        System.out.println();
    }
//Java program to remove vowel from a string
public static void removevowel(String str){
    String str1="";
    str1=str.replaceAll("[aeiouAEIOU]", "");
    System.out.println(str1);
}
//Java program to check String is a palindrome or not
public static void isPalindrome(String str) {
    boolean sub=true;
    int i=0;
    int j=str.length() - 1;
    while(i < j){
        if(str.charAt(i)!=str.charAt(j)){
            sub=false;
            break;
        }
        i++;
        j--;
    }
    if(sub){
        System.out.println("The entire String is palindrome");
    }
    else{
        System.out.println("The entire String is not palindrome");
    }    
}
}
