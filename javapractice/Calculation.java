import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
	int x,y,sum,sub,mul,div;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Type a number");
		x=scanner.nextInt();
		System.out.print("Type second number");
		y=scanner.nextInt();
		sum=x+y;
		sub=x-y;
		mul=x*y;
		div=x/y;
		System.out.println("sum of two numbers =" +sum);
		System.out.println("sub of two numbers ="+sub);
		System.out.println("mul of two numbers ="+mul);
		System.out.println("div of two numbers="+div);
	}
}
