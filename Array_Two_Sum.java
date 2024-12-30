//Two_Sum Problem
import java.util.*;

public class Array_Two_Sum {
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return new int []{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {7, 8, 2, 9, 10, 11};
        int x = 13;
        System.out.println(Arrays.toString(twoSum(nums,x)));
    }
}
