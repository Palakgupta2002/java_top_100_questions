import java.util.*;
class Accenture{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter rats");
        // int r=sc.nextInt();
        // System.out.println("enter unit of food");
        // int unit=sc.nextInt();
        // System.out.println("enter houses");
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        
        // for(int i=0;i<n;i++)
        // arr[i]=sc.nextInt();
        // System.out.println(solve(r, unit, n, arr));
        // System.out.println(passwordchecker("aA1_67",5));
        // int arr[]={12,3,14,56,77,13};
        // System.out.println(findcount(arr, 5, 13, 2));
        // System.out.println(divisble(4, 20));
        String str="Palak-rty";
        System.out.println(RemoveString(str,str.length()));



    }
    public static int solve(int r,int unit,int n,int arr[]){
        if(arr==null){
            return -1;
        }
        int res=r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
        sum+=arr[i];
        count++;
        if(sum>=res)
        break;
        }
        if(sum<res){
            return 0;
        }
        return count;

    }
    public static int passwordchecker(String str,int n){
        if(n<4){
            return 0;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }

        int countchar=0;
        int numer=0;
       
       for(int i=0;i<n;i++){
        if(str.charAt(i)==' ' || str.charAt(i)=='/'){
            return 0;
        }
        if(str.charAt(i)>='0' && str.charAt(i)>='9'){
            numer++;
        }
        if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            countchar++;
        }

       }
       if(countchar>0 && numer>0){
        return 1;
       }
       else{
        return 0;
       }


    }
    public static int findcount(int arr[],int length,int num,int diff){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(num-arr[i])<=diff){
                count++;
            }
        }
        return count>0?count:-1;
    }
    public static int divisble(int n,int m){
        //n is a divisor
        //m is a number 
        //here we take two variables to store these two's value sum
        int sum=0;
        int sum1=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum+=i;
            }
            else{
                sum1+=i;
            }
        }
        return sum>sum1?sum-sum1:sum1-sum;

    }
    //Remove String 
    public static String RemoveString(String str,int n){
        String res="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='-')
            res=str.charAt(i)+res;
            else
            res=res+str.charAt(i);
        }
        return res;
    }
}