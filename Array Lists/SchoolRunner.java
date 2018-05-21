public class SchoolRunner
{
    public static void main(String[] args)
    {
        Student bobby = new Student("Bobby", "Jones", 12, 7);
        Student kim = new Student("Kim", "Smith", 12, 7);
        Student johnny = new Student("Johnny", "Hero", 13, 7);
        
        Classroom c1 = new Classroom(3);
        
        System.out.println(c1.addStudent(bobby));
        System.out.println(c1.addStudent(kim));
        System.out.println(c1.addStudent(johnny));
        Student mary = new Student("Mary", "Lou", 12, 7);
        
        System.out.println(c1.addStudent(mary));
        
        System.out.println(c1);
    }
}