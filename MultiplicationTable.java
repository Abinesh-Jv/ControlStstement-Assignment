import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d%n", number, i, number * i);
        }
    }
}
