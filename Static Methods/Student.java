public class Student
{
    private String name;
    private int numGrade;
    private String letterGrade;
    
    public Student(String name, int numGrade)
    {
        this.name = name;
        this.numGrade = numGrade;
        letterGrade = "";
    }
    public String getName()
    {
        return name;
    }
    public int getNumGrade()
    {
        return numGrade;
    }
    public int getLetterGrade()
    {
      return letterGrade;  
    }
    public void setLetterGrade(String g)
    {
        letterGrade = g;
    }
    public void computeGrade()
    {
        if(numGrade >= 90)
        {
            letterGarde = "O";
        }
        else if(numGrade >= 80)
        {
            letterGrade = "S";
        }
        else if(numGrade >= 70)
        {wqz    
    
    
    \        letterGrade = "N";
        }
        else
        {
            letterGrade = "U";
        }
    }
    public String toString()
    {
        return "Name: " + name
            + "\nGrade: " + letterGrade + "\n";
    }
}