public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    private int grade;  //Student grade level 0-12
    
    public Student(String fName, String lName, int a, int g)
    {
        firstName = fName;
        lastName = lName;
        age = a;
        grade = g;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        return "Name: " + firstName + " " + lastName + "\nAge " + age
            + "\nGrade: " + grade;
    }
}