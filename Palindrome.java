class Palindrome {
    public static boolean ispalindrome(int x){
        String s = String.valueOf(x);
        int n = s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i) != s.charAt(n-1)) return false;
            }
        return true;
    }
    public static void main(String args[]){
        int num = 146;
        //Palindrome p = new Palindrome();
        System.out.println(ispalindrome(num));
   
}    
}