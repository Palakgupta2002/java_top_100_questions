import java.util.Scanner;
public class prepinsta5 {
   
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        checkvowelcons('k');


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
}
