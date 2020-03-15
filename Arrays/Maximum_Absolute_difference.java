// Problem link - https://www.interviewbit.com/problems/maximum-absolute-difference/

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = A.size();
        int arr[] = new int[n];
        int min_arr[] = new int[n];
        int max_arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = A.get(i);
        }
        
        for(int i=0;i<n;i++){
            min_arr[i] = arr[i] - i;
            max_arr[i] = arr[i] + i;
        }
        
        for(int i=0;i<n;i++){
            min = min > min_arr[i] ? min_arr[i] : min;
            max = max > min_arr[i] ? max : min_arr[i];
        }
        
        ans = Math.abs(max - min);
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            min = min > max_arr[i] ? max_arr[i] : min;
            max = max > max_arr[i] ? max : max_arr[i];
        }
        
        int temp = Math.abs(max - min);
        ans = ans > temp ? ans : temp;
        
        return ans;
    }
}
