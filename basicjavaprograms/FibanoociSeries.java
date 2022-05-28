import java.util.Scanner;

public class FibanoociSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit for fibonacci series");
        int number = sc.nextInt();
        int num1= 0;
        int num2 = 1;
        int sum = 0;
        System.out.print("fibonacci series is" + " " + num1 + " " + num2);
        for(int i = 3; i <= number; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
