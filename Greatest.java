import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = SC.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = SC.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = SC.nextInt();
        int greatest;  
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
    }
}
