//*****************************************************************************
// Ryan Hanaway
// Global Replace Runner PP1 MP3
//
//*****************************************************************************
public class GlobalRunner
{
    public static void main(String[] args)
    {
        GlobalReplace words = new GlobalReplace("I am doing homework at the Hackathon");
        System.out.println(words); //Does toString work
        
        words.replaceOne(words.toString(), 2,3, "am not "); //replace am with am not
        System.out.println(words);
        
        words.replaceAll(words.toString(), "a", "A"); //Changes all a to A
        System.out.println(words);
        
        words.undoReplaceAll();
        System.out.println(words); //changes back 1
        
        words.undoReplaceAll(); //should change to original string
        System.out.println(words);
    
        //test 2
         GlobalReplace stuff = new GlobalReplace("i am the dumbest one here");
        System.out.println(stuff); //Does toString work
        
        stuff.replaceOne(stuff.toString(), 2,3, "am not "); //replace am with am not
        System.out.println(stuff);
        
        stuff.replaceAll(stuff.toString(), "i", "1"); //Changes all i to 1
        System.out.println(stuff);
        
        stuff.undoReplaceAll();
        System.out.println(stuff); //changes back to last revision
        
        stuff.undoReplaceAll(); //should change to original string
        System.out.println(stuff);
        
        //test 3
         GlobalReplace a = new GlobalReplace("H0W M4NY L1CKS, THURBUR?");
        System.out.println(words); //Does toString work
        
        a.replaceOne(a.toString(), 1,1, "o"); //replace 0 with o
        System.out.println(a);
        
        a.replaceAll(a.toString(), "U", "( ͡° ͜ʖ ͡°)"); //you know
        System.out.println(a);
        
        a.undoReplaceAll();
        System.out.println(a); //changes back to original text
        
        a.undoReplaceAll(); //should change to blank string
        System.out.println(a);
    }
}