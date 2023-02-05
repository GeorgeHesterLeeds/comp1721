public class Circle
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    };

    public double getRadius()
    {
        return this.radius;
    };

    public double area()
    {
        return Math.PI * Math.pow(this.radius, 2);
    };

    public double perimiter()
    {
        return 2 * Math.PI * this.radius;
    };
};
