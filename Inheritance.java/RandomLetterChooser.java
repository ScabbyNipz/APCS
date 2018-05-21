//************************************************************************8
// Ryan Hanaway
// 3-15-2018
// Inheritance Programming Project Part B
//
//*************************************************************************
public class RandomLetterChooser extends RandomStringChooser
{
    
    public RandomLetterChooser(String str)
    {
        super(getSingleLetters(str));
    }
    public static String[] getSingleLetters(String str)
    {
        String[] splitArray = new String[str.length()];
        for (int i = 0;  i< str.length(); i++)
        {
            splitArray[i] = str.substring(i, i + 1);
        }
        return splitArray;
    }
}