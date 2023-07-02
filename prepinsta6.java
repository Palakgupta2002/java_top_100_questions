import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class prepinsta6 {
    public static void main(String[]args){
        // int arr[]={0,1,0,2,0,1,0,2};
        // sortarray(arr);
        // int ary[]={8,4,-6,4};
        // movenegative(ary);
        int ary[]={1,1,5,6,4};
        int ary1[]={2,3,1,1,4};
        int k=3;
        // union(ary1, ary);
        // Intersection( ary, ary1);
        // largestsum(ary1);
        // minmaxdiff(ary1, k);
        // System.out.println(minjump(ary1));
        finddup(ary1);
       

    }
    //Given an array which consists of only 0, 1 and 2. Sort the array without using any  algorithm
    public static void sortarray(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;
        int i=0;
        for(i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:
                count0++;
                break;
                case 1:
                count1++;
                break;
                case 2:
                count2++;
                break;
            }
        }
        i=0;
        while(count0>0){
            arr[i++]=0;
            count0--;
        }
        while(count1>0){
            arr[i++]=1;
            count1--;
        }
        while(count2>0){
            arr[i++]=2;
            count2--;
        }
        System.out.println(Arrays.toString(arr));
}
//Find kth max and min element in array in Java
public static void kthmaxmin(int arr[]){
    
}
//Move all the negative elements to one side of the array in Java
public static void movenegative(int ary[]){
    int temp=0;
    int j=0;
    for(int i=0;i<ary.length;i++){
       if(ary[i]<0){
        temp=ary[i];
        ary[i]=ary[j];
        ary[j]=temp;
        j++;
 }
       
    }
    System.out.println(Arrays.toString(ary));
}
//Find the Union and Intersection of the two sorted arrays in Java
public static void union(int arr[],int arr1[]){
    ArrayList<Integer>list=new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        if (!list.contains(arr[i])) {
            list.add(arr[i]);
        }
    }

    // Add values from arr1 to the list
    for (int i = 0; i < arr1.length; i++) {
        if (!list.contains(arr1[i])) {
            list.add(arr1[i]);
        }
    }

    System.out.println(list);    
}
public static void Intersection(int[] arr, int[] arr1) {
    ArrayList<Integer> list = new ArrayList<>();

    // Iterate through arr and check if each element is present in arr1
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr1.length; j++) {
            if (arr[i] == arr1[j] && !list.contains(arr[i])) {
                list.add(arr[i]);
                
            }
        }
    }

    System.out.println(list);
}
//Largest Sum Contiguous SubArray in Java
public static void largestsum(int arr[]){
    int res=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            res=Math.max(sum,res);

        }

    }
    System.out.println(res);
}
//Minimize the maximum difference between heights in Java
public static void minmaxdiff(int arr[],int k){
    Arrays.sort(arr);
    int n=arr.length;
    int diff=arr[n-1]-arr[0];
    int max;
    int min;
    
    for (int i=0;i<n;i++){
        if(arr[i]-k<0)continue;
         max=Math.max(arr[i-1]+k,arr[n-1]-k);
         min=Math.min(arr[i]-k, arr[0]+k);
         diff=Math.min(diff,max-min);
    }
    System.out.println(diff);
}
//Java Program To Find Minimum No. of Jumps to Reach The End of an Array
public static int minjump(int arr[]){
    int jum=0;
    int des=0;
    int pos=0;
    if(arr.length==0)
    return -1;
    for(int i=0;i<arr.length-1;i++){
        des=Math.max(des, arr[i]+1);
        if(pos==i){
            pos=des;
            jum++;
        }
    }
    return jum;

}
//find duplicate in an array of N+1 Integers in java
public static void finddup(int arr[]){
   for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length-1;j++){
        if(arr[i]==arr[j]){
            System.out.println(arr[i]);
        }
    }
   } 

    
}
}
