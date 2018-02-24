//****************************************************************************
//
//
//
//
//****************************************************************************
public class TVRunner
{
    public static void main(String[] args)
    {
        TV t1 = new TV(15,2);
        t1.power();
        
        System.out.println(t1);
        t1.changeChannel(199);
        for (int i = 0; i < 3; i++)
            t1.volumeDown();
        for (int i = 0; i < 2; i++)
            t1.channelUp();
        System.out.println(t1);
        t1.power();
        System.out.println(t1);
    }
}