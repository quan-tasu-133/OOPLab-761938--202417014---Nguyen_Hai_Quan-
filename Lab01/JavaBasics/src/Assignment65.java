import java.util.Scanner;
import java.util.Arrays;

public class Assignment65 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = keyboard.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = keyboard.nextDouble();
            sum += arr[i];
        }

        Arrays.sort(arr);

        double avg = sum / n;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}