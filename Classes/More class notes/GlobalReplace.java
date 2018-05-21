//****************************************************************************
// Ryan Hanaway
// Global Replace PP1 MP3
//
//****************************************************************************
public class GlobalReplace
{
    private static String[] savedText = new String[100];
    private static int index = 0;
    
    public GlobalReplace(String input)
    {
        savedText[0] = ""; //if undo is for first step
        index = index + 1; //no out of bounds hopefully
        savedText[index] = input;
    }
    public static String replaceOne(String text, int i, int n, String sub)
    {
        index++;
        savedText[index] = text.substring(0, i) + sub + text.substring(i + n, text.length());
        return savedText[index];
    }
    public static String replaceAll(String text, String what, String sub)
    {
     index++;
     while(text.indexOf(what) >= 0)
     {
        int temp = text.indexOf(what);
        text = text.substring(0, temp) + sub + text.substring(temp + what.length(), text.length());
     }
     savedText[index] = text;
     return savedText[index];
    }
    public String undoReplaceAll()
    {
        index--;
        return savedText[index];
    }
    public String toString()
    {
        return savedText[index];
    }
}
                        