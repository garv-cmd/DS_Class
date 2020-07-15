public class rotate {

    static int c =1;
    static void rotate(int a[],int d){
 //4,1,2,3
        int len = a.length;
        int temp = a[0];
        for(int i=0;i<len-1;i++){

                    a[i] = a[i+1];
        }
        a[len-1] = temp;
if(c==d) {
    for (int i = 0; i < a.length; i++) {

        System.out.print(a[i] + " ");
    }
}
c++;
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4};
        int d = 2; //no. of rotations
       
        int q = d;
        int c = 1;
        for(int i=0;i<d;i++)
        rotate(a,d);
    }
}
