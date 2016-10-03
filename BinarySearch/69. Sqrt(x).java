//Implement int sqrt(int x).
//Compute and return the square root of x.

public class Solution {
    public int mySqrt(int x) {
        if(x < 0) return -1;
        int L = 0, R = x;
        while(L+1 < R){
            int mid = L + (R-L)/2;
            if(isLarger(mid, x)){
                R = mid - 1;  //shrink the range to left part
            }else{
                L = mid;   //smaller or equal may be the answer, keep mid
            }
        }

        //1 or 2 item left
        if(R * R <= x) return R;
        return L;
    }

    boolean isLarger(int input, int target){
        long temp = (long)input * input;
        return temp > target;

    }

}





