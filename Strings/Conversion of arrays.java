Conversion of arrays:
====================

1>>String to int

import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s []= {"1","2"};
        //String to int
        int n[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            n[i]=Integer.parseInt(s[i]);
        }
        }
    }

2>>Int to string

import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]={1,2,3};
        String s []= new String[n.length];
        //int to string
          StringBuilder sb=new StringBuilder();
        for(int i=0;i<n.length;i++){
            sb.append(i);
        }
        String ab=sb.toString();
        System.out.print(sb);
        }
    }


3>> String to char


import java.util.Scanner;
public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s []={"mano","karthi"};
        char[][] ch=new char[s.length][];
        //String to char if the sizes are differ in the string
        for(int i=0;i<s.length;i++){
            ch[i]=s[i].toCharArray();
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        }
    }







