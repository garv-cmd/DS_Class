import java.util.Arrays;

public class MaxElement {
    public static void main(String args[]){
        int a[] = {1,2,6,4,3,7,35,65};
        int max = -9999;
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max)
                max = a[i];
        }

        System.out.println(max);


    }
}


