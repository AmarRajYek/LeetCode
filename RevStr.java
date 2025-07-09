import java.util.*;
class RevStr{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb =  new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
//OTHER LOGIC
/*String str = "AMAR";
        String rev = "";
            for(int i = str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
        System.out.println(rev); */