import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

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
        // isPalindrome("palak");
        // reversestring("hello");
        // removeSpecialCharacter("P9l@k");
       // removespace("Palak Gupta ");
       //removespacesecond("palak Gupta hello");
       //removedrackets("(a+b=c)");
        // countsumofnumber("1df5hj6");
    //  capitalizeFirst("Palak Gupta hello");
    //  checkFrequency("palakpalak");
    //  findnonrepeating("Palkkk");
    // findnonrepeating("care","race");
    //    nonrepeatingString("prepinsta");
    replacesubstring("This is Prepnsta","The");

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
//Java program to reverse a string
public static void reversestring(String str){
    String temp="";
    str.toCharArray();
    for(int i=str.length()-1;i>=0;i--){
        temp=temp +str.charAt(i);
    }
    System.out.println(temp);
}
//Java program to remove characters in a string except alphabets
public   static void removeSpecialCharacter(String str)
{
    str=str.replaceAll("[^a-zA-Z]","");
    System.out.println(str);
   
}
//Java program to Remove spaces from a string
public  static void removespace(String str) {
    str=str.replaceAll(" ","");
    System.out.println(str);
    
}
//Java program to Remove spaces from a string (second method)
public static void removespacesecond(String s){
    char[] c = s.toCharArray();
    StringBuffer sb = new StringBuffer();
    
    
    for (int i = 0; i < c.length; i++) {
       if( (c[i] != ' ') && (c[i]!= '\t' )) {
           sb.append(c[i]);
       }    	
        }
    System.out.println("String after removing spaces : "+sb);
}
//Java program to remove brackets from an algebraic expression
public static void removedrackets(String str){
    char ch[]=str.toCharArray();
    StringBuffer str1=new StringBuffer();
    for(int i=0;i<ch.length;i++){
        if(ch[i]!='[' && ch[i]!=']' && ch[i]!='{' && ch[i]!='}' && ch[i]!='('  && ch[i]!=')' ){
            str1.append(ch[i]);

        }
    }
    System.out.println(str1);
    
}
//Java Program to Count The Sum of Numbers in a String
public static void countsumofnumber(String str){
    int sum=0;
    char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){
        if(Character.isDigit(ch[i])){
            sum=sum+Character.getNumericValue(ch[i]);
        }

    }
    System.out.println(sum);
}
//Java program to Capitalize the First and Last letter of Each Word of a String
public static void capitalizeFirst(String Str) {
    String[] str1=Str.split(" ");
    String newstring="";
    for(String a:str1){
        int length=a.length();
        String s=a.substring(0, 1);
        String b=a.substring(1, length-1);
        String l=a.substring(length-1);
        newstring= newstring+s.toUpperCase()+b+l.toUpperCase()+" ";
    }
    System.out.println(newstring);  
}
//Java program to check frequency of characters in a string
public static void checkFrequency(String str) {
    str.toLowerCase();
    String[] freq = new String[str.length()];
    boolean[] counted = new boolean[str.length()];
  
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      if (!counted[i]) {
        for (int j = i + 1; j < str.length(); j++) {
          if (str.charAt(i) == str.charAt(j)) {
            count++;
            counted[j] = true;
          }
        }
        freq[i] = String.valueOf(str.charAt(i)) +": " +String.valueOf(count + 1);
      }
    }
  
    for (int k = 0; k < str.length(); k++) {
      if (freq[k] != null) {
        System.out.println(freq[k]);
         }
    }
    

  }
  //Java program to Find First non repeating character in a String
  public static void nonrepeatingString(String str){
    String[] freq = new String[str.length()];
    boolean[] counted = new boolean[str.length()];
    str=str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      int count = 1;
      if (!counted[i]) {
        for (int j = i + 1; j < str.length(); j++) {
          if (str.charAt(i) == str.charAt(j)) {
            count++;
            counted[j] = true;
          }
        }
        if(count==1){
        freq[i] = String.valueOf(str.charAt(i)) +": " +String.valueOf(count);
        }
      }
    }
  
    for (int k = 0; k < str.length(); k++) {
      if (freq[k] != null) {
        System.out.println(freq[k]);
         }
    }

  }
  public static void findnonrepeating(String str1,String str2){
      
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
  //Java Program to Replace Substring in a String
  public static void replacesubstring(String str,String word){
    String msg[]=str.split(" ");
    String new_str="";
    for(String words:msg){
      if(!words.equals(word)){
        new_str+=word+"";
        System.out.println(words);
      }
    }
    System.out.println(new_str);
    
}
} 
  
