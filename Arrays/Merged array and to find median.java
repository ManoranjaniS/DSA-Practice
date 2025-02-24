Merged array and to find median



import java.util.Arrays;
import java.util.Scanner;

public class Problem452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 3;
        int[] arr1 = new int[s];
        System.out.println("Enter " + s + " elements for the second array:");
        for (int i = 0; i < s; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] mer = new int[n + s];
        for (int i = 0; i < n; i++) {
            mer[i] = arr[i];
        }
        for (int i = 0; i < s; i++) {
            mer[n + i] = arr1[i];
        }

        Arrays.sort(mer);
        System.out.print("Merged array: ");
        for (int i : mer) {
            System.out.print(i + " ");
        }
        System.out.print(Arrays.toString(mer));

        int val = mer.length;
        double med;
        if (val % 2 == 0) {
            med = ((double) mer[val / 2 - 1] + mer[val / 2]) / 2;
        } else {
            med = mer[val / 2];
        }

        System.out.println("\nMedian: " + med);

        sc.close();
    }
}
