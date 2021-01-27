import java.util.Scanner;

public class CompositeLogicalOperators{
    public static void main(String args[]){

        //VARS
        int userEntered = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        userEntered = in.nextInt();

        if ((userEntered % 2 != 0 && userEntered > 100) || (userEntered %2 ==0 && userEntered < 100)){
            System.out.println("(the number is odd and greater than 100) or (the number is even and less than 100)");
        }
        if (userEntered != 42){
            System.out.println("You do not have the answer");
        }
        if ((userEntered > 100) || (userEntered < 50 && userEntered % 2 != 0 && userEntered > 15)){
            System.out.println("(the number is greater than 100) or (less than 50 and not even and greater than 15)");
        }
    }
}