public class AlarmClock extends Clock
{
    private int alarmHours;
    private int alarmMinutes;

    public AlarmClock()
    {
        super(0, 0, 0);
    };

    public AlarmClock(int h, int m)
    {
        super(h, m, 0);
    };

    public AlarmClock(int h, int m, int s)
    {
        super(h, m, s);
    };

    public int getAlarmHours()
    {
        return this.alarmHours;
    };

    public int getAlarmMinutes()
    {
        return this.alarmMinutes;
    };

    public void setAlarm(int h, int m)
    {
        if (h >= Clock.HOURS_IN_A_DAY || h < 0)
        {
            throw new IllegalArgumentException("invalid alarm hours");
        }

        if (m >= Clock.MINUTES_IN_AN_HOUR || m < 0)
        {
            throw new IllegalArgumentException("invalid alarm minutes");
        }

        this.alarmHours = h;
        this.alarmMinutes = m;
    };

    public boolean isRinging()
    {
        int alarmEpoch = (this.alarmHours * 60 * 60) + (this.alarmMinutes * 60);
        int clockEpoch = (this.getHours() * 60 * 60) + (this.getMinutes() * 60) + this.getSeconds();

        if (clockEpoch < alarmEpoch)
            return false;

        if (clockEpoch > alarmEpoch + 14)
            return false;

        return true;
    };

    @Override
    public void display()
    {
        if (this.isRinging())
        {
            System.out.printf("%s - WAKE UP!%n", this);
        }
        else
        {
            System.out.printf("%s%n", this);
        }
    };
};