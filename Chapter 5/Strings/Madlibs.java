//*************************************************************
//
// Hanaway, Ryan J.
// Madlibs
//*************************************************************
import java.util.Scanner;

public class Madlibs
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String story = "According to all known laws of ___, there is no "
            +"\nway a ___ should be able to ___.Its wings are too small to get "
            +"\nits fat little body off the ground. The ___, of course, flies "
            +"\nanyway because bees don't care what ___ think is impossible.";
        
        //blank1 verb, blank2 animal, blank3 verb2, blank4 animal2, blank5 thing
        
        String verb, verb2, animal, animal2, thing;
        final String BLANK = "___";
        int underscore = BLANK.length();
        
        System.out.print("Enter a verb: ");
        verb = scan.nextLine();
        System.out.print("Enter another verb: ");
        verb2 = scan.nextLine();
        System.out.print("Enter an animal: ");
        animal = scan.nextLine();
        System.out.print("Enter another animal: ");
        animal2 = scan.nextLine();
        System.out.print("Enter a thing: ");
        thing = scan.nextLine();
        //only use string methods in AP thing
        
       story = story.substring(0, story.indexOf(BLANK))
            + verb
            + story.substring(story.indexOf(BLANK) + BLANK.length());
        
        story = story.substring(0, story.indexOf(BLANK))
            + animal
            + story.substring(story.indexOf(BLANK) + BLANK.length());
        
        story = story.substring(0, story.indexOf(BLANK))
            + verb2
            + story.substring(story.indexOf(BLANK) + BLANK.length());
        
        story = story.substring(0, story.indexOf(BLANK))
            + animal2
            + story.substring(story.indexOf(BLANK) + BLANK.length());
        
        story = story.substring(0, story.indexOf(BLANK))
            + thing
            + story.substring(story.indexOf(BLANK) + BLANK.length());
            
        System.out.print(story);

    }
    
}