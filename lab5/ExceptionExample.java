import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample{

    public static int quotient(int numerator, int denominator)throws ArithmeticException{
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner in_scanner = new Scanner(System.in);
        boolean contLoop = true;
        do{
            try{
            System.out.println("Enter integer numerator");
            int numerator = in_scanner.nextInt();
            System.out.println("Enter integer denominator");
            int denominator = in_scanner.nextInt();

            int result = quotient(numerator, denominator);

            System.out.printf("\nResult: %d / %d = %d\n",numerator, denominator, result);
            }
            catch(InputMismatchException errorInputMismatchException){
                System.err.printf("\nException: %s\n" , errorInputMismatchException);
                in_scanner.nextLine();
                System.out.println("You must enter the values. Please try again");
            }
            catch(ArithmeticException errorArithmeticException){
                System.err.printf("\nException: %s\n" , errorArithmeticException);
                in_scanner.nextLine();
                System.out.println("Denominator can't be zero. Please try again");
            }

         }while(contLoop);

    }


} 