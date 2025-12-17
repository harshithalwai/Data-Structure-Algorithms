import java.util.*;
public class Lec40 {
    public static int FirstSearch(int[]arr,int target){
        int start=0,end=arr.length-1,mid=-1,result=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]==target) {
                result=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static int LastSearch(int[]arr,int target){
        int start=0,end=arr.length-1,mid=-1,result=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]==target) {
                result=mid;
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={5,7,7,7,7,8,8,10};
        int target=7;
        int []ans={FirstSearch(arr,target),LastSearch(arr,target)};
        System.out.println(Arrays.toString(ans));
    }
}