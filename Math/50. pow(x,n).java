public class Solution {
    boolean notZero(double x){
        return x<-1e-10 || x>1e-10;

    }


    public double myPow(double x, int n) {
        //edges
        //x^0=1 ; 0^0
        if(n == 0){
            return 1.0;
        }
        //base
        if(n == 1){
            return x;
        }

        //x^(-1)
        long m;
        if(n < 0 && notZero(x)){
            x = 1/x;
            m =  -((long)n);
        }else{
            m = n;
        }

        //int range: -2147483648 ~ 2147483647


        //induction
        double half = myPow(x, (int)(m/2));
        if(m%2 == 1){
            return half * half * x;
        }else{
            return half * half;
        }

    }
}
