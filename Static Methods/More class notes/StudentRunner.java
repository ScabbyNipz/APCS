public class StudentRunner
{
    public static void main(String[] nuts)
    {
        Student[] studentList = new Student[30];
        studentList[0] = new Student("Jane", "Jones");
        studentList[1] = new Student("Jim", "Moore");
        
        for(int i = 0; i < studentList.length; i++)
        {
            if(studentList[i] == null)
            {
                System.out.println("Position: " + i);
                break;
            }
        }
        Student bob = new Student("Bob", "Smith");
        Student lisa = new Student("Lisa", "Fresco");
        Student rob = new Student("Rob", "Sellers");
        
        System.out.print(bob);
        System.out.print(lisa);
        System.out.print(rob);
        
        bob = rob;
        
        System.out.print(bob);
        System.out.print(lisa);
        System.out.print(rob);
        
        rob.setLastName("Goose");
        
        System.out.print(bob);
        System.out.print(lisa);
        System.out.print(rob);
    }
}