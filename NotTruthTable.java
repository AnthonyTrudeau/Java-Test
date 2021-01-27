import java.util.Scanner;

public class NotTruthTable{
    public static void main(String args[]){

        //VARS
        boolean enteredBoolean = false;
        boolean notBoolean = false;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a boolean (true or false) :" );
        enteredBoolean = in.nextBoolean();

        notBoolean = !enteredBoolean;
        System.out.println("You entered "+enteredBoolean+", !"+enteredBoolean+"=="+notBoolean);       
    }
}