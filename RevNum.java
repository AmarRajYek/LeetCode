public class RevNum {
    public static void main(String[] args) {
        int num = 1534236469;
        int rev = 0;
            while(num !=0){
                int digit = num%10;
                rev  = rev*10 +digit;
                num/=10;
            }
            System.out.println("rev string: " +rev);
    }
}
