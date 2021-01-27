import java.util.Scanner;

public class ConditionalMathEquation{
    public static void main(String args[]){

        //Vars
        double first = 0;
        double second = 0;
        double third = 0;
        double fourth = 0;
        double temp = 0;

        Scanner in = new Scanner(System.in);

        //Ask user for their numbers
        System.out.print("Enter a number for first: ");
        first = in.nextInt();
        System.out.print("Enter a number for second: ");
        second = in.nextInt();
        System.out.print("Enter a number for third: ");
        third = in.nextInt();
        System.out.print("Enter a number for fourth: ");
        fourth = in.nextInt();
        if (third == 0){
            if (second >=0){
                temp = (first+second)*fourth;
                System.out.println("("+first+"+"+second+")*"+fourth+"="+temp);
            }
            else if (second < 0){
                temp = (first-second)*fourth;
                System.out.println("("+first+"-"+second+")*"+fourth+"="+temp);
            }
        }
        else if (third != 0){
            temp = (first/third)*second+(fourth/third);
                System.out.println("("+first+"/"+third+")*"+second+"+("+fourth+"/"+third+")="+temp);
        }





    }
}