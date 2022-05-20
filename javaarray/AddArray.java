public class AddArray {
		public static void main(String[] args) {
			int[] num = new int[10];
			for( int i = 0; i < num.length; i++) {
				num[i] = i+1;
			}
			int add = 0;
			for( int i = 0; i < num.length; i++) {
				add += i;
			}
			System.out.println("Addition of given numbers = "+ add);
		}
	}
