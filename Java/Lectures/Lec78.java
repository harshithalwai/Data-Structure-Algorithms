import java.util.Arrays;

public class Lec78{
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1,0};
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
        }
        sum+=1;
        int n=Long.toString(sum).length();
        int []res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=sum%10;
            sum=sum/10;
        }
        System.out.println(Arrays.toString(res));
    }
}