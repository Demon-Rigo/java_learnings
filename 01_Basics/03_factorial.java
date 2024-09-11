import java.util.Scanner;
class factorial {
    public static void main(String args[])
    {
        int factorial=1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to find it's factorial= ");
       int number = sc.nextInt();
       for(int i=1; i<=number; i++){
        factorial *= i;
       }
       System.out.println("Factorial of "+number+" is "+ factorial);
    }
}
