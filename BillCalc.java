import java.lang.*;
import java.util.*;
class BillCalc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of pizzas :");
        int p=sc.nextInt();
        System.out.print("Enter number of puffs :");
        int puff=sc.nextInt();
        System.out.print("Enter number of Drinks :");
        int cooldrink=sc.nextInt();
        int pizzaa = Math.abs(p) * 100;
        int Cooldrink = Math.abs(cooldrink) * 10;
        int puffs = Math.abs(puff) * 20;
        System.out.println("Number of Pizzas :"+pizzaa);
        System.out.println("Number of Puffs :"+puffs);
        System.out.println("Number of Cooldrinks :"+cooldrink);
        int tot = pizzaa+puffs+cooldrink;
        System.out.println("Total bill :"+tot);
    }
}