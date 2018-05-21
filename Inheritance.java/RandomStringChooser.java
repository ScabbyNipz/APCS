//**************************************************************************************
//
//
//
//
//**************************************************************************************
import java.util.Random;
public class RandomStringChooser
{
    private String[] words;
    private int wordCount;
    private String chosen;
    private int random;
    private Random gen = new Random();
    
    public RandomStringChooser(String[] wordInput)
    {
        words = wordInput;
        wordCount = words.length;
        
    }
    public String getNext()
    {
        random = gen.nextInt(words.length);
        chosen = words[random];
        if (wordCount <= 0)
        {
            chosen = "NONE";
        }
        if (wordCount > 0)
        {
            while (chosen == null)
            {
            random = gen.nextInt(words.length);
            chosen = words[random];
            }
        }
        words[random] = null;
        wordCount--;
        return chosen;
    }
}