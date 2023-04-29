import java.util.*;
public class Prepinsta4 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
           int n=sc.nextInt(); 
           int[] Array = new int[n];
           for(int i=0;i<n;i++){
           System.out.println("enter a array's value(positive number) ");
            Array[i]=sc.nextInt();
            // System.out.print(getmin(Array, n));

           }
           System.out.println("enter a number");
           int n2=sc.nextInt(); 
           int[] Array2 = new int[n];
           for(int i=0;i<n;i++){
           System.out.println("enter a array's value(positive number) ");
            Array2[i]=sc.nextInt();
           }
        //    largestsmallest(Array, n);
        // secondsmallestnumber(Array, n);
        // arraysum(Array, n, 0);
        // System.out.print( arraysumrecursion(Array, n, 0,0));
        // slidingreversearray(Array, n);
        // fhassshdss(n, Array);
        // sortarray(Array, n);
        //findfrequency(n, Array);
        // longestpalindrome(Array, n);
        // countdistinctelement(Array, n);
        // findrepeateelement(Array, n);
        // nonrepeatingelement(Array, n);
        // countevenodd(Array, n);
        // maximumsubarray(Array, n);
        // System.out.println(arraysdisjoint(Array, Array2));
        // isSubset(Array, Array2, n, n2);
        sortanaarayaccording(Array,Array2);

        }
        //Java Program for finding the largest element of the array
        public static int getmax(int [] array,int n){
            if(n==1){
                return array[0];
            }
           return Math.max(array[n-1],getmax(array, n-1) );
        }
        //Java Program for finding the smallest element of the array
        public static int getmin(int [] array,int n){
            if(n==1){
                return array[0];
            }
           return Math.min(array[n-1],getmin(array, n-1) );
        }
        //Print Java Program for Finding the Smallest and largest element in an array
        public static void largestsmallest(int aar[],int n){
            System.out.print("largest number"+getmax(aar, n));
            System.out.print("smallest number"+getmin(aar, n));
        }
        //Java program for finding the second smallest element in an array
public static void secondsmallestnumber(int aar[],int n){
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        if(aar[i] < smallest){
            secondSmallest = smallest;
            smallest = aar[i];
        }
        else if(aar[i] < secondSmallest && aar[i] != smallest){
            secondSmallest = aar[i];
        }
    }
    System.out.println("The second smallest number is " + secondSmallest);
}
//print calculate the sum of array
public static void  arraysum(int arr[],int n,int sum){
for(int i=0;i<n;i++){
    sum=sum+arr[i];
}
System.out.println(sum); 

}
//print array sum by recurssion

public static int arraysumrecursion(int arr[],int n,int sum,int pos){
    if(pos==n){
        return sum;
    }
    return arraysumrecursion(arr,n,sum+arr[pos],pos+1);

}
//print reverse pattern of array
//there is three way to do this
//1 approach is :- brute forse to declare one another array and do this
//2 approch is:- secondly i traverse or print it in reverse form 
//3 approch is= i do this one by one to take two iterator mean by sliding window
public static void slidingreversearray(int array[],int n){
    int i=array.length-1;
    int j=0;
    int temp;
    for(int p=0;p<n;p++){
        if(i==j){
            for(int k=0;k<n;k++){
                System.out.print(array[k]+" ");
            }
            return;
        }
        else{
        temp=array[j];
        array[j]=array[i];
        array[i]=temp;
        j++;
        i--;
        }
    }   
}
// Print Sort first half in ascending order and second half in descending
public static void fhassshdss(int n,int arr[]){
    int temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n/2;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        for(int j=n/2;j<n-1;j++){
            if(arr[j+1]>arr[j]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
//Sort the elements of an array 
public static void sortarray(int[] ary,int n){
    Arrays.sort(ary);
    for(int i=0;i<ary.length;i++){
        System.out.print(ary[i]+" ");
    }
}
//Print Java program to find the frequency of elements in an array
public static void findfrequency(int n,int arr[]){
   
   Arrays.sort(arr);
   for(int i=0;i<arr.length;i++){ 
    int count=1;

    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
        else{
            break;
        }
    }
    System.out.print( arr[i]+":"+count+""+",");
i+=(count-1);
       
    
   }
   
}
//Print Java program for Sorting elements of an array by frequency

public static void sortfindfrequency(int n,int arr[]){
   
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){ 
     int count=1;
 
     for(int j=i+1;j<arr.length;j++){
         if(arr[i]==arr[j]){
             count++;
         }
         else{
             break;
         }
     }
     System.out.print( arr[i]+":"+count+""+",");
 i+=(count-1);
        
     
    }
    
 }
 //This is helper Program
 public static boolean ispalindrome(int number) {
    int reverse=0;
    int number1=number;
    int rem;
    while(number!=0){
        rem=number%10;
        reverse=reverse*10+rem;
        number/=10;
    }
    //System.out.print("the reverse no is "+reverse);
   if(reverse==number1){
    return true;
   }
   else{
    return false;
   }
    
}

 
 //Print Java program for longest palindrome in an array
  public static void longestpalindrome(int ary[],int n) {
    int res=-1;
    for(int i=0;i<n;i++){
       if(ary[i]>res && ispalindrome(ary[i])) {
        res=ary[i];
        System.out.println(res);
       }
    } 
 }
 //Print Java program to count distinct element in an array
 public static void countdistinctelement(int ary[],int n){
    Arrays.sort(ary);
    for(int i=0;i<ary.length;i++){
        int count=1;
        for(int j=i+1;j<ary.length;j++){
            if(ary[i]==ary[j]){
                count++;
            }
            else{
                break;
            }
        }
        if(count==1){
            System.out.println(ary[i]+":"+count);
        }
        i=i+count-1;
        
    }
 }
 //Print Java program for finding repeating element in an array
 public static void findrepeateelement(int ary[],int n) {
    Arrays.sort(ary);
    for(int i=0;i<ary.length;i++){
        int count=1;
        for(int j=i+1;j<ary.length;j++){
            if(ary[i]==ary[j]){
                count++;
            }
            else{
                break;
            }
        }
        if(count>1){
            System.out.println(ary[i]+":"+count);
        }
        i=i+count-1;
        
    }
    
 }
 //Print Java program to find non-repeating elements in an array
 public static void nonrepeatingelement(int ary[],int n){
    Arrays.sort(ary);
    for(int i=0;i<ary.length;i++){
        int count=1;
        for(int j=i+1;j<ary.length;j++){
            if(ary[i]==ary[j]){
                count++;
            }
            else{
                break;
            }
        }
        if(count==1){
            System.out.println(ary[i]+":"+count);
        }
        i=i+count-1;
        
    } 
 }
 //Java program to count numbers of even and odd elements in an array
 public static void countevenodd(int arr[],int n){
    int even=0;
    int odd=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("The total no. of even no. is"+""+even);
    System.out.println("The total no. of odd  no. is"+""+odd);
 }
 //Maximum product of sub-array in Java
 public static void maximumsubarray(int arr[],int n){
    int result=arr[0];
    for(int i=0;i<n;i++){
        int mul=arr[i];
        for(int j=i+1;j<n;j++){
            result=Math.max(result, mul);
            mul=mul*arr[j];
        }
        result=Math.max(mul,result);
    }
    System.out.println(result);
 }
 //Java program to find Arrays are disjoint or not
 public static boolean arraysdisjoint(int arr[], int arr1[]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr[i]==arr[j]){
               
                return false;
            }
           
        }
    }
    return true;
} 
static boolean isSubset(int arr1[], int arr2[], int m, int n)
{
    int i = 0;

    for (i = 0; i < n; i++) {
        if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
            return false;
    }

    return true;
}

static int binarySearch(int arr[], int low, int high, int x)
{
    if (high >= low)
    {
        /*low + (high - low)/2;*/
        int mid = (low + high)/ 2;

        if ((mid == 0 || x > arr[mid - 1])&& (arr[mid] == x))
            return mid;
        else if (x > arr[mid])
            return binarySearch(arr,(mid + 1), high,x);
        else
            return binarySearch(arr, low,(mid - 1), x);
    }
    return -1;
}
//Java Program to find sum of minimum absolute difference of the given array
public static int summinabsdif(int arr[],int n){
    int result=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=Math.abs(arr[i]-arr[j]);
        }
        result=Math.min(sum,result);
    }
    return result;
}
//Java program to Sort an array according to the order defined by another array

public static void sortanaarayaccording(int arr[],int arr1[]){
  int temp[]=new int[arr.length];
  for(int i=0;i<arr1.length;i++){
    int key=arr1[i];
   
        for(int k=0;k<arr.length;k++){
            if(arr[k]==key){
                temp[k]=arr[k];
            }

        }

    
  }
  for(int u=0;u<arr.length;u++){
    System.out.print(temp[u]);
  }


}
 }