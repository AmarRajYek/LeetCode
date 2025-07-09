import java.util.*;
public class TwoSum {
   public int[] Twosum(int[] arr, int tar){
   // int n = arr.length;
    for(int i=0;i<arr.length-1;i++){  //for(int i=0;i<arr.length;i++)
        for(int j =i+1;j<arr.length;j++ ){ // for(int j =i+1;i<arr.length;j++  )
                if(arr[i] + arr[j] ==  tar){
                    return new int[] {i,j};
                }
        }
    }
    return new int[]{};
   }
    public static void main(String args[]){
        int[] arr = {2,7,11,15};
        TwoSum obj = new TwoSum();
      //  int[] index = obj.Twosum(arr, 9);
        System.out.print(Arrays.toString(obj.Twosum(arr, 9)));
    }
}
