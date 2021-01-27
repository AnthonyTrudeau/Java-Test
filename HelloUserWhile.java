import java.util.Scanner;

public class HelloUserWhile{
    public static void main(String args[]){
        
        //VARS
        String userName = "";
        int count = 0;

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter your name: ");
        userName = in.nextLine();  

        do{
            System.out.println("Hello: "+userName+"!");
            count++;
        }while (count < 5);  
    }
}