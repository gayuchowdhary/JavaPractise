import java.util.Scanner;

	public class SearchArr {
		public static void main(String[] args) {
			int count = 0;
			int[] numbers = new int[100];
			Scanner scanner = new Scanner(System.in);
			for( int i = 0; i < numbers.length; i++) {
				numbers[i] = i+1;
			}
			System.out.print("Enter the number to be searched:" );
			int num = scanner.nextInt();
			for( int i = 0; i < numbers.length; i++) {
				if( numbers[i] == num) {
					count++;
					break;
				}
			}
			if( count == 1)
				System.out.println("True");
			else
				System.out.println("False");

		}
	}
