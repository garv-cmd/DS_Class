package searching;

import java.util.Arrays;

public class BinarySearch {
    static void searchIt(int a[] , int num , int low,int high) {

        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == num){
                System.out.println("found" + mid);


            }
            else if(a[mid] > num){
                high = mid-1;
            }
            else low = mid+1;
        }
    }


    public static void main(String args[]) throws Exception{
        int a[] = {1,2,4,8,6,4,8,9,56,24,67};
        Arrays.sort(a);
        if(a.length==0){
            throw new Exception("Array is Empty");
        }
        int num = 56;
        int low = 0;
        int high = a.length-1;
        int mid = (low+high)/2;
        searchIt(a,num,low,high);

    }
}
