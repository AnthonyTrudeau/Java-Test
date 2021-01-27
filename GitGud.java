import java.util.Scanner;

public class GitGud{
    public static void main(String args[]){
        
        //Vars
        int userEntered = 0;

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter a Number: ");
        userEntered = in.nextInt();

        if (userEntered % 3 == 0){
            System.out.print("Git");
        }
        if (userEntered % 5 == 0){
            System.out.print("Gud");
        }
    }
}