import java.util.Scanner;

public class Fibbonacci {
    public static void printArray (int[] mas, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    public static int fibbonacci (int[] mas, int n) {
        if (mas[n] == 0) {
            mas[n] = fibbonacci(mas, n - 1) + fibbonacci(mas, n - 2);
            return mas[n];
        }
        else {
            return mas[n];
        }
    }

    public static void main(String[] args) {
        int[] mas = new int[1000];
        mas[1] = 1;
        mas[2] = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number (number < 1000)");
        int n = input.nextInt();
        fibbonacci(mas, n);
        printArray(mas, n);
    }
}
