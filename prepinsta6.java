import java.util.Arrays;

public class prepinsta6 {
    public static void main(String[]args){
        int arr[]={0,1,0,2,0,1,0,2};
        sortarray(arr);

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
    
}
