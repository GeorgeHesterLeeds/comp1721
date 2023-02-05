public class CircleDemo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1.00001);
        Circle circle3 = new Circle(3.5345456);

        System.out.printf("To string test, should be Circle(radius=3.5345): %s%n", circle3.toString());
        System.out.printf("Equals test, should be true: %b%n", circle1.equals(circle2));
        System.out.printf("Equals test, should be false: %b%n", circle2.equals(circle3));

        try
        {
            Circle circle4 = new Circle(0);
        }
        catch (IllegalArgumentException exception)
        {
            System.err.println(exception.getMessage());
            System.exit(1);
        }

        System.exit(0);
    }
}
