import java.sql.Array;
import java.util.*;

public class prepinsta6 {
    public static void main(String[]args){
        // int arr[]={0,1,0,2,0,1,0,2};
        // sortarray(arr);
        // int ary[]={8,4,-6,4};
        // movenegative(ary);
        // int ary1[]= {8, 4, 2, 1};
        // int arr[]={7, 1, 5, 3, 6, 4};
        // int sum=8;
        // int[] arr1 = {4, 2, -3, 1, 6};
        // int ary2[]={0,2,4,6,8,9};
        // int k=3;
        // union(ary1, ary);
        //  int[][] array = {{1,2},{3,6},{4,8}  };
        // Intersection( ary, ary1);
        // largestsum(ary1);
        // minmaxdiff(ary1, k);
        // System.out.println(minjump(ary1));
        // finddup(ary1);
        // mergetwosorted(ary1, ary2);
        //  merge(array);
        // countinvrsion(ary1);
        // buysell(arr);
        // sumequal(arr, sum);
// System.out.print(findsunarraysum(arr1));
largenofact(22);

       

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
//Program to Merge two sorted arrays without using Extra space in Java
public static void mergetwosorted(int arr1[],int arr2[]){
    int n=arr1.length;
    int m=arr2.length;
    int i=0;
    int j=0;
    while(i<n){
        if(arr1[i]>arr2[j]){
            //swap the program
            int temp=arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;
            sortedarr2(arr2);


        }
        i++;
    }
    System.out.println(Arrays.toString(arr1)+Arrays.toString(arr2));
}
//This is a helping function of mergesorted array
public static void sortedarr2(int arr2[]){
    for(int i=0;i<arr2.length-1;i++){
        if(arr2[i]>arr2[i+1]){
            int temp=arr2[i+1];
            arr2[i+1]=arr2[i];
            arr2[i]=temp;

        }
    }
}
//Java program for Kadane’s Algorithm
public static void Kadanesalgo(int arr[]){
    
}
//Java Program for Merge intervals
//(1,3),(2,6)=(1,6)
 public static void merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();

        stack.push(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int startpoint2 = intervals[i][0];
            int endpoint2 = intervals[i][1];
            int[] poparray = stack.pop();
            int startpoint1 = poparray[0];
            int endpoint1 = poparray[1];
            int endmax = Math.max(endpoint1, endpoint2);
            if (endpoint1 >= startpoint2) {
                int[] merge = new int[] { startpoint1, endmax };
                stack.push(merge);
            } else {
                stack.push(poparray);
                stack.push(intervals[i]);
            }
        }

        System.out.println("Merged intervals:");
        while (!stack.isEmpty()) {
            int[] element = stack.pop();
            System.out.println(Arrays.toString(element));
        }
    }
    //Java program for count inversion
    public static void countinvrsion(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int  j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //Best time to buy and Sell stock in java
    public static void buysell(int arr[]){
    
        int sell;
        int index;
        int buy=arr[0];
        int profit=0;
        //if there is only one value
        if(arr.length-1==0){
            System.out.println("There is no stock");

        }
        //if there is only one value
        if(arr.length-1==1){
            System.out.println("You can buy ,but we are not assure in future this is safe or not");
        } 
        // if there is only two values
        if(arr.length-1==2){
            if(arr[0]<arr[1]){
                System.out.println("this is best time to buy it");
            }
            else{
                System.out.println("This is not safe");
            }
        }
        //This is for 3 or more
       if(arr.length-1>=3){
        for(int i=0;i<arr.length-2;i++){
            buy=Math.min(arr[i],buy);
            if(arr[i+1]>buy){
                profit=Math.max(profit,arr[i+1]-buy);

            }
        }
    
       }
       System.out.println("Your profit is "+profit);
       
    }
    //Program to find all pairs on integer array whose sum is equal to given number in java
    public static void sumequal(int arr[], int sum){
        //use case
        //case 1 if there is no value in array
        if(arr.length-1==0){
            System.out.println("There is none value");
        }
        //case 2 if there is only one values in array
        if(arr.length-1==1){
            if(arr[0]==sum){
                System.out.println("This is not pair"+arr[0]);
            }
        }
        //case 3 if there is only two values 
        if(arr.length-1==2){
            if(arr[0]+arr[1]==sum){
                System.out.println("The pair is"+ "(" + arr[0]+ ","+arr[1]+")");
            }
        }
        //case 4 if there is more values than two
        if(arr.length-1>=3){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[i]+arr[j]==sum){
                        System.out.println("("+arr[i]+","+arr[j]+")");
                    }
                }
            }
        }

    }
    //Java Program to Find if there is any subarray with sum equal to 0
    public static boolean findsunarraysum(int arr[]){
       
        for(int i=0;i<arr.length-1;i++){
            
                int sum=0;
                for (int j=i;j<arr.length-1;j++){
                    sum=sum+arr[j];
                    if(sum==0){
                      return true;
                     
                    }
                    
                    }
                }
                
                return false;
        
    }
    //Factorial of a Large Number in Java
    public static void largenofact(int n){
        int res[] = new int[500];
 
        // Initialize result
        res[0] = 1;
        int res_size = 1;
 
        // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        System.out.println("Factorial of given number is ");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);

    }
    //multiply , this is a helping function
    public static int multiply(int x,int res[],int res_size){
        int carry = 0; // Initialize carry

        // One by one multiply n with individual
        // digits of res[]
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of
                                // 'prod' in res[]
            carry = prod/10; // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    // Driver program
   

}
