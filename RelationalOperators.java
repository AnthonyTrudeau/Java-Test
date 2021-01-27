import java.util.Scanner;

public class RelationalOperators{
    public static void main(String args[]){

        //Declare Vars
        int enteredNumberOne = 0;
        int enteredNumberTwo = 0; 
        boolean lessThan;
        boolean lessThanEqual;
        boolean moreThan;
        boolean moreThanEqual;
        boolean equal;

        Scanner in = new Scanner(System.in);

        //Get the first number
        System.out.print("Enter a number: ");
        enteredNumberOne = in.nextInt();

        //Get the second number
        System.out.print("Enter another number: ");
        enteredNumberTwo = in.nextInt();

        //Test the output
        System.out.println(enteredNumberOne +" "+ enteredNumberTwo);

        //LESS THAN
        if (enteredNumberOne < enteredNumberTwo){
            lessThan = true;
        }
        else{
            lessThan = false;
        }

        //MORE THAN
        if (enteredNumberOne > enteredNumberTwo){
            moreThan = true;
        }
        else{
            moreThan = false;
        }

        //LESS THAN EQUAL
        if (enteredNumberOne <= enteredNumberTwo){
            lessThanEqual = true;
        }
        else{
            lessThanEqual = false;
        }

        //MORE THAN EQUAL
        if (enteredNumberOne >= enteredNumberTwo){
            moreThanEqual = true;
        }
        else{
            moreThanEqual = false;
        }

        //EQUAL
        if (enteredNumberOne == enteredNumberTwo){
            equal = true;
        }
        else{
            equal = false;
        }

        //OUTPUT
        System.out.println(enteredNumberOne +"<"+ enteredNumberTwo +"? "+ lessThan);
        System.out.println(enteredNumberOne +"<="+ enteredNumberTwo +"? "+ lessThanEqual);
        System.out.println(enteredNumberOne +">"+ enteredNumberTwo +"? "+ moreThan);
        System.out.println(enteredNumberOne +">="+ enteredNumberTwo +"? "+ moreThanEqual);
        System.out.println(enteredNumberOne +"=="+ enteredNumberTwo +"? "+ equal);






    }
}