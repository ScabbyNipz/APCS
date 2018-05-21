/** Returns the award level obtained by this student: 0 for no award, 1 for AP Scholar, 2 for AP 
*   Scholar with Honor, and 3 for AP Scholar with Distinction. 
*   Precondition: exams.size() > 0
*/

public class APStudenthas
{
    private List<Exam> exams;
    
    public interface Exam
	{
		String getSubject();
		int getGrade();
	}

}