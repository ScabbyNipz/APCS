public class TV
{
    private int channel;
    private int volume;
    private boolean power;
    private final int MAX_CHANNEL = 200;
    private final int MAX_VOLUME = 30;
    
    public TV()
    {
        channel = 1;
        volume = 0;
        power = false;
    }
    public TV(int c, int v)
    {
        if (c >= 1 && c <= MAX_CHANNEL)
            channel = c;
        else
            channel = 1;
        if (v >= 0 && v <= MAX_VOLUME)
            volume = v;
        else
            volume = 0;
        power = false;
    }
    public void channelUp()
    {
        channel++;
        if (channel > MAX_CHANNEL)
            channel = MAX_CHANNEL;
    }
    public void channelDown()
    {
        channel--;
        if (channel < 1)
            channel = MAX_CHANNEL;
    }
    public void changeChannel(int c)
    {
        if(c >= 1 && c <= MAX_CHANNEL)
            channel = c;
    }
    public void volumeUp()
    {
        if(volume < MAX_VOLUME)
            volume++;
    }
    public void volumeDown()
    {
        if(volume > 0)
            volume--;
    }
    public void power()
    {
        if(power)
            power = false;
        else
            power = true;
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    public boolean getPower()
    {
        return power;
    }
    public String toString()
    {
        return "Power: " + power
            + "\nChannel: " + channel
            + "\nVolume: " + volume;
    }
}