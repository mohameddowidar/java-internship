import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] arr = new int[count];
        int number = input.nextInt();
        int pos = -1;
        for (int i = 0; i < count; i++) {
            arr[i] = input.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                pos = j;
                break;
            }
        }
        if (pos != -1 && pos < 5) {
            pos = -1;
            for (int i = pos + 1; i < arr.length; i++) {
                if (arr[i] == number) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos != -1) {
            System.out.println("First occurrence of " + number + " is at position " + pos);
        } else {
            System.out.println("The number " + number + " is not found in the array.");
        }
    }
}