import java.io.IOException;
import java.io.Writer;

public class Circle implements Writeable
{
    private double radius;

    public Circle(double r)
    {
        this.radius = r;
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

    @Override
    public void writeTo(Writer destination) throws IOException
    {
        destination.write(String.format("Circle(radius=%.4f)%n", this.radius));
    };
};
