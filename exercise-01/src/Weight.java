import java.util.Scanner;

public class Weight
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");

        String userInput = scanner.nextLine();
        scanner.close();
        double kilograms = 0.0;

        try
        {
            kilograms = Double.parseDouble(userInput);
        }
        catch (Exception exception)
        {
            System.out.println("Input was of an invalid format.");
            System.exit(1);
        }

        int pounds = (int) Math.floor(kilograms * 2.20462262185);
        double ounces = (kilograms - (pounds / 2.20462262185)) * 35.27396195;

        System.out.printf("Equivalent imperial weight is %,d lb %.1f oz%n", pounds, ounces);

        System.exit(0);
    };
};
