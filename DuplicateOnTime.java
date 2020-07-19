package searching;

import static java.lang.Math.*;

public class DuplicateOnTime {
    //condition - array size -> n , elements -> n-1
    public static void main(String args[]){
        int arr[] = {1,2,3,1,3,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[abs(arr[i])] >= 0){
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            }
            else
                System.out.print(Math.abs(arr[i])+ " ");
        }
    }
}
