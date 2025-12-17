public class Lec38 {
     public static int ASCsearch(int[] nums, int target) {
        int st=0,end=nums.length-1,mid=-1;
        while (st<=end) {
            mid=st+(end-st)/2;
            if (nums[mid]==target) {
                  return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
     }
     public static int DESCsearch(int[] nums, int target) {
        int st=0,end=nums.length-1,mid=-1;
        while (st<=end) {
            mid=st+(end-st)/2;
            if (nums[mid]==target) {
                  return mid;
            }else if(nums[mid]>target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
     }
    public static void main(String[] args) {
        // int []arr={1,2,3,4,5,6};
        int []arr={99,88,77,66,55,44,33,22,11};
        System.out.println(DESCsearch(arr, 22));
    }
}
