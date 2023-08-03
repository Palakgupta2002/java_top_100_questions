import java.util.*;
class Accenture{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rats");
        int r=sc.nextInt();
        System.out.println("enter unit of food");
        int unit=sc.nextInt();
        System.out.println("enter houses");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println(solve(r, unit, n, arr));


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
}