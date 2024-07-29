import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum of even numbers in the array is: " + sum);
    }
}
