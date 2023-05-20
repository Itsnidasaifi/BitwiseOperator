public class OddEven {
    public static void main(String[] args) {
        int n=77;
        System.out.println(isOdd(n));
        
    }
    static boolean isOdd(int n){
        return (n & 1)==1;
    }
    /*
     * as the and bitwise operator works as if u and 1 with any bits the result will be that bit
     * example if 1&0==0
     * if 1&1==1
     * as we know the ,that in binary numbers the LSB of number represents whether it is negative or positive
     * bcs  all the bits in binary form is in the multiple of 2 acccept LSB bcs 2^0 will be 1 
     * hence we know that if the LsB of a binary number contains 1 then it will be an odd number 
     * and if & that odd number with 1 then the odd number will comes out
     * that's why we use & operator
     */
    
}
