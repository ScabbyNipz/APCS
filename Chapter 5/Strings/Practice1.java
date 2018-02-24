//
//
//
//
//
input java.util.Scanner;

public class Practice1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence, word;
        System.out.println("Enter a string: ");
        sentence = scan.nextLine();
        System.out.println("Enter another string: ");
        word = scan.nextLine();
        
        if(sentence.indexof(word) >= 0)
            System.out.println(sentence + " contains " + word);
        else
            System.out.println(sentence + " doesn't contain " + word);
        
        
    }
}