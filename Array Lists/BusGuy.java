public class BusGuy implements Person
{
    public int distance (Student other)
    {
       String s1Street = this.getStreet();
       String otherStreet = other.getStreet();
       int differentStreet = 99999;
       
       if (s1Street.equalsIgnoreCase(otherStreet))
       {
           return Math.abs(s1Street.getNumber() - otherStreet.getNumber());
       }
       else
           return differentStreet;
    }
}