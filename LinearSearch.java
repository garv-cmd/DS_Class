package searching;

public class LinearSearch {
    public static void main(String args[]){
        int a[] = {1,2,6,5,2,5,67,3,99};
        int num = 67;
        for(int i :a){
            if(i==num){
                System.out.println("Found");
                break;
            }
        }
    }
}
