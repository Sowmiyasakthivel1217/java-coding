import java.util.Scanner;

public class SumOfEvenIndices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int N = s.nextInt();
        int[] array = new int[N];
        System.out.println("Enter " + N + " values:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i += 2) {
            sum += array[i];
        }
        System.out.println("Sum of values at even indices: " + sum);
    }
}
