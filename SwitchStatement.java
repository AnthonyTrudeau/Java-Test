import java.util.Scanner;

public class SwitchStatement{
    public static void main(String args[]){

        //VARS
        int enteredLevel;

        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter a level: ");
        enteredLevel = in.nextInt();

        switch(enteredLevel) {
            case 1 :
            System.out.println("Level 1: Rats and Bathrooms.");
            break;
            case 2 :
            System.out.println("Level 2: Office Space Available.");
            break;
            case 3 :
            System.out.println("Level 3: Warehouse Space Available.");
            break;
            case 4 :
            case 5 :
            System.out.println("Level 5 Atrium and Cockroaches.");
            break;
            case 6 :
            System.out.println("Level 6 Eastern Australia and Kitchen.");
            break;
            default :
            System.out.println("Invalid Level.");
        }
    }
}