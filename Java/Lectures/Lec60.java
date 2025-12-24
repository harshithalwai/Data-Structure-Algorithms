
import java.util.*;
public class Lec60 {

    public static void main(String[] args) {
        int arr[]={1,4,3,8,5};
        ArrayList<Integer>lst=new ArrayList<>();
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
                lst.add(arr[i]);
            }
        }
        System.err.println(lst);
    }
}