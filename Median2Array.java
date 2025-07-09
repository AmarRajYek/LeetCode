import java.util.*;
public class Median2Array {
    public double  Median2SortedArr(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
            //Creating a array to Merge 
            int[] Merge = new int[n+m];
            int k=0;
                for(int i=0;i<n;i++){
                    Merge[k++] =  nums1[i];
                }
                for(int j=0;j<m;j++){
                    Merge[k++] =  nums2[j];
                }
            //sort the Merged array
            Arrays.sort(Merge);

            //count the number of elements in mergerd array .
            int total = Merge.length;

            //if total elements are Odd then
            if(total % 2 == 1){
                return(double) Merge[total / 2];
            }else{
                int left = Merge[total / 2 - 1];
                int right = Merge[total / 2];
                return(double) (left + right ) / 2.0;
            }
    }
    public static void main(String args[]){
        int[] nums1 ={5,7};
        int[] nums2 ={9,10};
        Median2Array obj =  new Median2Array();
       double res= obj.Median2SortedArr(nums1, nums2);
        System.out.print("==>MEDIAN VALUE  " +res);


    }
}
