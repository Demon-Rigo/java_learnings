import java.util.Scanner;
class UserInput {
    public static void main(String args[])
    {
      int number1, number2, sum;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter First Number=");
      number1 = input.nextInt();

      System.out.println("Enter Second Number");
      number2 = input.nextInt();
      
      sum=number1+number2;
      System.out.println("SUM =" + sum);
    }

}

