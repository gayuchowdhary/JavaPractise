import java.util.Scanner;

public class VowelsConsonent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // char ch = (char)scan.nextInt();
        char ch = scan.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println(ch + " is vowel");
        }
        else
            System.out.println(ch + " is consonant");
    }
}
