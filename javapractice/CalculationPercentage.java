import java.util.Scanner;

public class CalculationPercentage {
   public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      System.out.print("enter scoring marks:");
      float marks=scanner.nextFloat();
      System.out.print("enter total marks :");
      float total= scanner.nextFloat();
      percentageOfMarks(marks,total);
   }

   public static void percentageOfMarks(float marks, float total) {
      float percentage = (marks*100)/total;
      System.out.println("Percentage ="+ percentage+"%");
   }
}
