import java.util.*;
class RevStr{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb =  new StringBuilder(str); //or i can do here StringBuilder sb =  new StringBuilder(str).reverse(); then print sb
        sb.reverse();
        System.out.println(sb);
    }
}
//ANOTHER LOGIC 1
/*String str = "AMAR";
        String rev = "";
            for(int i = str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
        System.out.println(rev); 
        
//ANOTHER LOGIC 2
    StringBuilder ans =  new StringBuilder();
    for(int i=str.length()-1;i>=0;i--){
    ans.append(str.charAt(i));
    }
    System.out.println(ans);
    
        
        
        */

