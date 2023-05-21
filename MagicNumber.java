public class MagicNumber {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int base=5;
        /*
             * let's first understand what the  magic numbers are
             * suppose if n=1 the binary representation of 1 would be 1 
             * multiply 1 * 5 raised to the power 1=5
             * if n=2 BP=10 the Multiply 1*5^2+0*5^1=25
             * if n=4 BP=100 --> 1*5^3+0*5^2+0*5^1=125
             * 
             */
        while(n>0){ 
            // if u & any number with 1 the number will be the same
            // now shifting the number towards right 
            
            int last=n&1;
            n=n>>1;

            ans+=last*base;
            base=base*5;

        }
        System.out.println(ans);
    }
    
    
}
