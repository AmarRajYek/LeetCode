class Palindrome {
    public static boolean ispalindrome(int x){
        String s = String.valueOf(x);
        int n = s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-1-i)) return false;
            }
        return true;
    }

    //another easiest metod using StringBuilder
    // public boolean chekPal(int num){
    //     String s = String.valueOf(str);
    //     return s.equals(new StringBuilder(s).reverse().toString());
    // }
    public static void main(String args[]){
        int num = 146;
        //Palindrome p = new Palindrome();
        System.out.println(ispalindrome(num));
   
}    
}
