// This is a Program to count the Subarray of length 3
public class CountSubarrayofLen3 {
   public  int CountSub(int[]  arr){
        int count=0;
        for(int i = 0; i + 2 <arr.length; i++){
            if(2*(arr[i] + arr[i+2]) == arr[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountSubarrayofLen3 obj = new CountSubarrayofLen3();
        int[] arr = {1,2,1,4,1,4,1};
        
        System.out.println(" "+obj.CountSub(arr));
    }
}

