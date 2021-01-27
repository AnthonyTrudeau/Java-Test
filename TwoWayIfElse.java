import java.util.Scanner;

public class TwoWayIfElse{
    public static void main(String args[]){

        //Vars
        int enteredNumber = 0;

        Scanner in = new Scanner(System.in);

        //Ask user for their number
        System.out.print("Enter a number: ");
        enteredNumber = in.nextInt();

        //Run the If for more than 10
        if (enteredNumber > 10){
            System.out.println("The number you have entered is greater than 10.");
        }
        else{
            System.out.println("The number you have entered is less than or equal to 10.");
        }
        
        //Run the If for less than 5
        if (enteredNumber < 5){
            System.out.println("The number you have entered is less than 5.");
        }
        else{
            System.out.println("The number you have entered is greater than or equal to 5.");
        }

        //Print the entered number
        System.out.println("The number you entered is: "+enteredNumber);
    }
}