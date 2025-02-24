find the vowels and consonants count in the given word


import java.util.Scanner;
public class Learning {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String n = sc.nextLine();
        int count = 0;
        int c=0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O' || n.charAt(i) == 'U' || n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                count++;
            }
            else{
                c++;

            }
        }
        System.out.println("vowels - " + count);
        System.out.println("Consonants - " + c);
    }

    }
