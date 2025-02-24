Array
1)Write a program to insert an element in an array in the given position
I/P : [1,2,3,4,5] Size=5 Insert:10
public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("enter val");
            a[i] = sc.nextInt();
        }
        System.out.println("enter pos");
        int pos = sc.nextInt();
        int val;
        System.out.println("enter val");
        if (pos > n) {
            System.out.println("Invalid");
        } else {
            val = sc.nextInt();
            i = 0;
            while (i < n) {
                if (i == pos - 1) {
                    System.out.printf("%d %d",val,a[i]);
                } else {
                    System.out.print(a[i]+" ");
                }
                i++;
            }
        }
    }
}
