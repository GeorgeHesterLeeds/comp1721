import java.io.IOException;
import java.io.Writer;

public class Money implements Writeable
{
    private int euros;
    private int cents;

    public Money(int e, int c)
    {
        this.euros = e;
        this.cents = c;
    };

    public int getEuros()
    {
        return this.euros;
    };

    public int getCents()
    {
        return this.cents;
    };

    public Money plus(Money other)
    {
        int summationEuros = this.euros + other.euros;
        int summationCents = this.cents + other.cents;
        return new Money(summationEuros + summationCents / 100, summationCents % 100);
    };

    @Override
    public void writeTo(Writer destination) throws IOException
    {
        destination.write(String.format("Money: €%d.%02d%n", this.euros, this.cents));
    };
};
