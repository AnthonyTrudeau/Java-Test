import java.util.Scanner;

public class EvenNumber{
    public static void main(String args[]){

        //VARS
        int userEntered = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        userEntered = in.nextInt();
        System.out.println("You entered "+userEntered);

        if (userEntered % 2 == 0){
            System.out.print(userEntered+" is even");
        }
    }
}