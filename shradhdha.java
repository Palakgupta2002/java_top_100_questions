import java.util.Arrays;

class shradhdha{
    public static void main(String []args){
        //Maximum and Minimum Element in an Array
        int Array[]={4,6,9,1,0,8,2};
        minmax(Array);

    }
    public static void minmax(int Array[]){
        Arrays.sort(Array);
        System.out.println(" Min "+Array[0]+" Max "+Array[Array.length-1]);
    }
}