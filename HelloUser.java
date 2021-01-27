import java.util.Scanner;

public class HelloUser{
    public static void main(String args[]){
        
        //VARS
        String userName = "";

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        userName = in.nextLine();  

        System.out.println("Hello: "+userName+"!");
    }
}