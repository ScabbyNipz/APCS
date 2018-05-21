import java.util.ArrayList;

public class SchoolBus
{
    public Student[] seats;
    
    public SchoolBus(int s)
    {
       seats = new Student[s]; 
    }
    public boolean isFull()
    {
        int openSeat = 0;
        int takenSeat = 0;
        for (Student i : seats)
        {
            if (seats[i] == null)
                openSeat++;
            else
                takenSeat++;
                
        }
        if (openSeat > 0)
            return false;
        else
            return true;
    }
    public boolean addStudent(Student student)
    {
        if(this.isFull() == true)
            return false;
        else 
        {
           for (Student i : seats)
            {
                if (seats[i] == null)
                {
                    seats[i] = student;
                    return true;
                }
            }
        }
    }
    public ArrayList<Student> getListOfStudents()
    {
        ArrayList<Student> seatOutput = new ArrayList<Student>();
        for (Student i : seats)
        {
            seatOutput[i] = seats[i];
        }
        return seatOutput;
    }
}