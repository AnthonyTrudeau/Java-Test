import java.util.Scanner;

public class ConditionalExpression{
    public static void main(String args[]){

        //VARS
        int enteredOne;
        int enteredTwo;
        int bigger;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        enteredOne = in.nextInt();
        System.out.print("Enter a second number: ");
        enteredTwo = in.nextInt();

        System.out.println("Which number is bigger? "+enteredOne+" or "+enteredTwo+"?");

        bigger = (enteredOne > enteredTwo) ? enteredOne : enteredTwo;

        System.out.println(bigger);
    }
}