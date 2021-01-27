import java.util.Scanner;

public class HelloUserFor{
    public static void main(String args[]){
        
        //VARS
        String userName = "";

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        userName = in.nextLine();  

        for (int x = 0; x <5; x++){
            System.out.println("Hello: "+userName+"!");
        }  
    }
}