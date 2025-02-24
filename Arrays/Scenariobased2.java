If a person has 3 diff fruits of 30kg,15kg,20kg and cost price ofthese are rs5 per kg,rs 3 per kg.rs 6 per kg,resp .if aa person selling these rs 6 per kg, rs4 per kg,rs 5 per kg;then calculate the total profit and loss



Ans:
import java.util.Scanner;
public class Problem452 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        int cp[]=new int[c];
        int sp[]=new int[c];
        System.out.println("enter the cp");
        System.out.println("enter the sp");
        for(int i=0;i<c;i++){
           cp[i]=sc.nextInt();
           sp[i]=sc.nextInt();
        }
        int p=0;
        int l=0;
        int val=0;
        for(int i=0;i<c;i++){
            p+=cp[i];
            l+=sp[i];
            val=p-l;
        }


        if(val>0){
            System.out.println(val+"% profit");
        }
        else{
            System.out.println(Math.abs(val)+"% loss");
        }

    }
}