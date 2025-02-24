to insert a word in a already exitsed one




import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String in=sc.nextLine();
        int ind=sc.nextInt();
        String val="";
        if(ind>s.length()){
            System.out.println("invalid");
        }else{
            for(int i=0;i<s.length();i++){
                val=s.substring(0,ind+1)+in+s.substring(ind+1);
            }

        }
        System.out.println(val);


    }
}

