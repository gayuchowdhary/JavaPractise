
public class Calculation {
    int number1, number2;
    Calculation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    int addition()
    {
        return number1 + number2;
    }
    int subtraction()
    {
        return number1 - number2;
    }
    int multiplication()
    {
        return number1 * number2;
		}
    int division() {

        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculation math = new Calculation(4, 2);
        int add_result = math.addition();
        System.out.println("addition result is" + " " + add_result);
        int sub_result = math.subtraction();
        System.out.println("subtraction result is" + " " + sub_result);
        int mul_result = math.multiplication();
        System.out.println("multiplication result is" + " " + mul_result);
        int div_result = math.division();
        System.out.println("division result is" + " " + div_result);

    }
}
