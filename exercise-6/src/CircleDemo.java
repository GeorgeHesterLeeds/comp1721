public class CircleDemo
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.err.println("Usage: java CircleDemo <radius>");
            System.exit(1);
        }

        double radius = 0;

        try
        {
            radius = Double.parseDouble(args[0]);
        }
        catch (Exception exception)
        {
            System.err.println("Error: Input was of an invalid format");
            System.exit(1);
        }

        Circle circle = new Circle(radius);

        System.out.printf("Radius    = %.1f%n", circle.getRadius());
        System.out.printf("Perimeter = %.3f%n", circle.perimiter());
        System.out.printf("Area      = %.3f%n", circle.area());
        System.exit(0);
    }
}
