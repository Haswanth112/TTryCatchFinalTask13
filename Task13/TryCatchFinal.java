import java.util.Scanner;
class TryCatchFinal
{
public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
        try {
            System.out.print("Enter A value :");
            int a=s.nextInt();
            System.out.print("Enter B value :");
            int b=s.nextInt();
            int result = divide(a,b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}