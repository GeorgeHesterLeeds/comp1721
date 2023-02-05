public class MeanValue
{
    public static double meanValue(double[] data)
    {
        double total = 0;

        for (int i = 0; i < data.length; i++)
        {
            total += data[i];
        }

        return total / data.length;
    }

    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.err.println("Usage: java MeanValue <values...>");
            System.exit(0);
        }

        double[] values = new double[args.length];

        for (int i = 0; i < args.length; i++)
        {
            try
            {
                values[i] = Double.parseDouble(args[i]);
            }
            catch (Exception exception)
            {
                System.out.println("Error: Input was of an invalid format");
                System.exit(1);
            }
        }

        System.out.printf("Mean value = %.3f%n", meanValue(values));
        System.exit(0);
    }
}
