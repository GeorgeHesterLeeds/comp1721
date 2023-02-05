public class Circle
{
    private double radius;

    Circle()
    {
        this.radius = 1;
    };

    Circle(double radius)
    {
        if (radius <= 0)
            throw new IllegalArgumentException("Invalid radius");

        this.radius = radius;
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
    public String toString()
    {
        return String.format("Circle(radius=%.4f)", this.radius);
    };

    @Override
    public boolean equals(Object object)
    {
        if (object == this)
            return true;

        if (!(object instanceof Circle))
            return false;

        Circle circle = (Circle) object;

        double difference = Math.abs(circle.getRadius() - this.radius);

        if (difference > 0.00005)
            return false;

        return true;
    };
};