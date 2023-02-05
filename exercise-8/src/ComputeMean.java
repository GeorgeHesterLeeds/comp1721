import java.io.FileNotFoundException;

public class ComputeMean
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.err.println("Usage: java ComputeMean <filename>");
            System.exit(1);
        }

        try
        {
            Dataset numbers = new Dataset(args[0]);
            System.out.printf("Dataset size = %d\n", numbers.size());
            System.out.printf("Mean value = %.3f\n", numbers.meanValue());
        }
        catch (FileNotFoundException exception)
        {
            System.err.printf("Error: cannot access '%s'\n", args[0]);
            System.exit(1);
        }
        catch (Exception exception)
        {
            System.err.println(exception);
            System.exit(1);
        }

        System.exit(0);
    };
};
