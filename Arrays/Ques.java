Ques:
ans:
import java.util.Scanner;
import java.util.Arrays;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double score=0;
        double weight = 0;
        double sum=0;
        double val=0;
        for(int i=0;i<n;i++){
            score=sc.nextDouble();
            weight=sc.nextDouble();
            sum += score * weight;
            val+=weight;
        }

        double f=sum/val;
        System.out.printf("%.2f",f);


    }
}