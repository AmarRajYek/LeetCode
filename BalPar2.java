import java.util.*;
class BalPar2{
    public static boolean BalParSol(String s){
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
             else if (st.size()>0 &&
                        (c == ')' && st.peek() == '('
                             || c == '}' && st.peek() == '{'
                            || c == ']' && st.peek() == '[')){
                    st.pop();
                }
                else{
                    return false;
                }
        }
        if(st.size()==0){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    public static void main(String args[]){
        String my = "({[]";
        boolean isBal = BalParSol(my);
		System.out.print(" Are parentheses balanced? " + isBal);
        
        
    }
}