//*****************************************************************************
// Ryan Hanaway
// Programming Project 2 MP2
// 1/9/18
//
//*****************************************************************************
public class SchoolLockers
{
    public static void main(String[] args)
    {
        int[] lockers = new int[100];
        int open = 1;
        int closed = 2;
        
        for(int i = 0; i < lockers.length - 1; i++)
        {
            lockers[i] = 1;
        }
        
        for (int student = 0; student <= lockers.length - 1; student++)
        {
            int index;
            if(student % 2 == 0)
            {
                for (index = student; index <= lockers.length - 1; index++)
                    lockers[index] = 2;
            }
            else if(student % 2 != 0)
            {
                for (index = student; index <= lockers.length - 1; index++)
                    lockers[index] = 1;
            }
        }
        for (int check = 0; check < lockers.length - 1; check++)
            if (lockers[check] == 1)
                System.out.println("Locker " + check + " is open.");
    }
}
