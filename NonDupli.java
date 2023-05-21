public class NonDupli {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,4};
        System.out.println(single(arr));
    }
    
    static int single(int arr[]){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
        /*
         * here we are xor the array's element one by one 
         * when we xor zero with any number then the result wouuld be that number
         * 00^01=01
         * 01^10=11
         * 11^11=00
         * 000^100=100
         * 100^101=001
         * 001^001=000
         * 000^010=010
         * 010^011=001
         * 001^100=101
         * decimal representation of 101 is 5 which is the required answer
         * value of unique will be 5
         */

    }
}
