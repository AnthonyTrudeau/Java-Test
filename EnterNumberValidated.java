import java.util.Scanner;

public class EnterNumberValidated{
    public static void main(String args[]){
        
        //VARS
        int enteredNumber = 0; 

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter a number between 10 and 20: ");
        enteredNumber = in.nextInt(); 

        while (enteredNumber > 20 || enteredNumber < 10){
            System.out.print("Invalid entry try again.");
            enteredNumber = in.nextInt();
        }
        
        System.out.println("You entered: "+enteredNumber);
    }
}