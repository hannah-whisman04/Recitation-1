import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // TODO Define char and string variables similarly

        // For Int
        System.out.print("Enter integer: ");
        int userInt = scnr.nextInt();


        //For double
        System.out.print("Enter double: ");
        double userDouble = scnr.nextDouble();

        //For character
        System.out.print("Enter character: ");
        char userChar = scnr.next().charAt(0);

        //For string
        System.out.print("Enter string: ");
        String userString = scnr.next();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

        // TODO (2): Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        // TODO (3): Cast the double to an integer, and output that integer
        int castedInt = (int) userDouble;
        System.out.println(userDouble + " cast to an integer is " + castedInt);
    }
}