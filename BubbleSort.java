package sortin;

public class BubbleSort {
    public static void main(String args[]){
        int a[] = {10,5,3,7,3,9,1,0};
        int i,j;
        int temp;
        boolean swapped  = false;
        for(i=0;i<a.length;i++){
            swapped = false;
            for(j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        for(int q : a)
            System.out.println(q);
    }
}
