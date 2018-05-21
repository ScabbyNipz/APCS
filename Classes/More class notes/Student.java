//Blueprint for student data
public class Student
{
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public boolean sameLastName(Student other)
    {
        return this.getLastName().equalsIgnoreCase(other.getLastName());
    }
    public String toString()
    {
        return "First Name: " + firstName
            + " \tLast Name: " + lastName + "\n";
    }
}