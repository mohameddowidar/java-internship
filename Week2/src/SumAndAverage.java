import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }
        int sum = getSum(arr);
        double average = getAverage(arr);

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);

    }
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double getAverage(int[] arr) {
        int sum = getSum(arr);
        double average = (double) sum / arr.length;
        return average;
    }
}