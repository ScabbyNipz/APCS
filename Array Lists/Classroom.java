import java.util.ArrayList;

public class Classroom
{
    ArrayList<Student> students = new ArrayList<Student>();
    private int seats;
    
    public Classroom(int s)
    {
        seats = s;
    }
    
    public int getSeats()
    {
        return seats;
    }
    
    public boolean addStudent(Student student)
    {
        if(students.size() >= seats)
            return false; //when there is return statement EXITS METHOD
            
        students.add(student);
        return true;
    }
    public boolean removeStudent(Student student)
    {
        int studentIndex = students.indexOf(student);
        if (studentIndex < 0)
            return false;
            
        students.remove(studentIndex);
        return true;
    }
    public int getNumberOfStudents()
    {
        return students.size();
    }
    public String toString()
    {
        System.out.println(students);
        String classInfo = "";
        for (Student s : students)
        {
            classInfo += s.toString() + "\n";
        }
        return classInfo;
    }
}