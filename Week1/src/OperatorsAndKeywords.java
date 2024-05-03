import java.util.Scanner;

public class OperatorsAndKeywords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        long sum = numberOne + numberTwo;
        int differience = numberOne - numberTwo;
        long product = numberOne * numberTwo;
        double division = numberOne / numberTwo;
        System.out.println(sum);
        System.out.println(differience);
        System.out.println(product);
        System.out.println(division);
    }
}
