public class Clock implements Runnable
{
    protected static final int SECONDS_IN_A_MINUTE = 60;
    protected static final int MINUTES_IN_AN_HOUR = 60;
    protected static final int HOURS_IN_A_DAY = 24;

    private int hours;
    private int minutes;
    private int seconds;

    public Clock()
    {
        this(0, 0, 0);
    };

    public Clock(int h, int m)
    {
        this(h, m, 0);
    };

    public Clock(int h, int m, int s)
    {
        this.setHours(h);
        this.setMinutes(m);
        this.setSeconds(s);
    };

    private void setHours(int h)
    {
        if (h < 0 || h >= Clock.HOURS_IN_A_DAY)
        {
            throw new IllegalArgumentException("invalid hours");
        }

        this.hours = h;
    };

    private void setMinutes(int m)
    {
        if (m < 0 || m >= Clock.MINUTES_IN_AN_HOUR)
        {
            throw new IllegalArgumentException("invalid minutes");
        }

        this.minutes = m;
    };

    private void setSeconds(int s)
    {
        if (s < 0 || s >= Clock.SECONDS_IN_A_MINUTE)
        {
            throw new IllegalArgumentException("invalid seconds");
        }

        this.seconds = s;
    };

    public int getHours()
    {
        return this.hours;
    };

    public int getMinutes()
    {
        return this.minutes;
    };

    public int getSeconds()
    {
        return this.seconds;
    };

    @Override
    public String toString()
    {
        return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
    };

    public void display()
    {
        System.out.println(this);
    };

    public void tick()
    {
        seconds++;

        if (seconds == Clock.SECONDS_IN_A_MINUTE)
        {
            seconds = 0;
            minutes++;

            if (minutes == Clock.MINUTES_IN_AN_HOUR)
            {
                minutes = 0;
                hours++;

                if (hours == Clock.HOURS_IN_A_DAY)
                {
                    hours = 0;
                }
            }
        }
    };

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                display();
                tick();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException error)
        {
            System.exit(1);
        }
    };
};