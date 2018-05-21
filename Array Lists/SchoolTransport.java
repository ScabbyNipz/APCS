public class SchoolTransport
{
    private List<SchoolBus> buses;
    public boolean enroll(Student student)
    {
        int tempDist = 0;
        int smallestDist = 999999;
        int closest = 0;
        int bestBus = 0;
        int fullBus = 0;
        for(SchoolBus b : buses)
        {
            if (buses[b].isFull() == false)
            {
                for(Student s : seats)
                {
                    tempDist = student.distance(s);
                    if (tempDist < smallestDist)
                    {
                        smallestDist = tempDist;
                        closest = smallestDist;
                    }
                }
               
            }
            else
                fullBus++;
            if (smallestDist < closest)
               {
                    closest = smallestDist;
                    bestBus = b;
               }
        }
        if (fullBus < buses.size())
        {    
            buses[bestBus].addStudent(student);
            return true;
        }
        else
            return false;
    }
}