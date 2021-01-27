import java.util.Scanner;

public class ExclusiveOrTruthTable{
    public static void main(String args[]){

        //VARS
        boolean enteredBoolean = false;
        boolean temp = false;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Boolean: ");
        enteredBoolean = in.nextBoolean();

        temp = enteredBoolean ^ enteredBoolean;
        System.out.println(enteredBoolean+" or "+enteredBoolean+"=="+temp);
        temp = enteredBoolean ^ !enteredBoolean;
        System.out.println(enteredBoolean+" or "+!enteredBoolean+"=="+temp);
        temp = !enteredBoolean ^ enteredBoolean;
        System.out.println(!enteredBoolean+" or "+enteredBoolean+"=="+temp);
        temp = !enteredBoolean ^ !enteredBoolean;
        System.out.println(!enteredBoolean+" or "+!enteredBoolean+"=="+temp);
    }
}