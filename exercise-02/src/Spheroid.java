import java.util.Scanner;

public class Spheroid
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter equatorial radius in km: ");
        String equatorialRadiusInput = scanner.nextLine();

        System.out.print("Enter polar radius in km: ");
        String polarRadiusInput = scanner.nextLine();

        scanner.close();

        double equatorialRadius, polarRadius;
        equatorialRadius = polarRadius = 0;

        try
        {
            equatorialRadius = Double.parseDouble(equatorialRadiusInput);
            polarRadius = Double.parseDouble(polarRadiusInput);
        }
        catch (Exception exception)
        {
            System.out.println("Input was of an invalid format.");
            System.exit(1);
        }

        double eccentricity = Math.sqrt(1 - (Math.pow(polarRadius, 2) / Math.pow(equatorialRadius, 2)));
        double volume = (4 * Math.PI * Math.pow(equatorialRadius, 2) * polarRadius) / 3;

        System.out.printf("Eccentricity = %.3f%n", eccentricity);
        System.out.printf("Volume = %g cubic km%n", volume);

        System.exit(0);
    };
};
