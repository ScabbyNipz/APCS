java.util.ArrayList;
public class APStudent implements Exam
{
    public int getAwardLevel() 
    {
        int total = 0;
        int passed = 0;
        double avgGrade = 0;
	    for (Exam i : exams)
	    {
	        total += i.getGrade();
	        if (i.getGrade() >= 3)
	            passed++;
	    }
	    avgGrade = total / (exams.size());
	    if(passed < 3)
	        return "0";
	    else if (passed == 3)
	        return "1";
	    else if (passed == 4 && avgGrade >= 3.25)
	        return "2";
	    else if (passed == 5 && avgGrade >= 3.25)
	    	return "3";
    }
    public static double[] getStats(List<APStudent> list)
    {
    	for (APStudent i : list)
    	{
    		int noAward = 0;
    		int scholar = 0;
    		int scholarHonor = 0;
    		int scholarDist = 0;
    		if (i.getAwardLevel() == 1)
    			scholar++;
    		else if (i.getAwardLevel() == 2)
    			scholarHonor++;
    		else if (i.getAwardLevel() == 3)
    			scholarDist++;
    		else if (i.getAwardLevel() == 0)
    			noAward++;
    	}
		p[0] = ((noAward / list.size()) * 100);
    	p[1] = ((scholar / list.size()) * 100);
    	p[2] = ((scholarHonor / list.size()) * 100);
    	p[3] = ((scholarDist / list.size()) * 100);
   		return p;
    }
}