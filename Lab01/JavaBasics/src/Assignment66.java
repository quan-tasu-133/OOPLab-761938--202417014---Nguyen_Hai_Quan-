import java.util.Scanner;

public class Assignment66 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = keyboard.nextInt();

        System.out.print("Enter columns: ");
        int cols = keyboard.nextInt();

        double[][] A = new double[rows][cols];
        double[][] B = new double[rows][cols];
        double[][] C = new double[rows][cols];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = keyboard.nextDouble();
            }
        }

        System.out.println("Enter matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = keyboard.nextDouble();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Result matrix C:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}