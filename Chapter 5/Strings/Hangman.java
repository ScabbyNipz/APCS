//**************************************************************************
// HANGMAN ( ͡° ͜ʖ ͡°)
// Hanaway, Ryan J.
//
//**************************************************************************
import java.util.Scanner;

public class HangmanGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sentence, sentBlanks="", temp ="", entry="";
        int incorrect = 0, finds = 0;
        System.out.print("Player 1, enter sentence: ");
        sentence = scan.nextLine();
        System.out.println("*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n* ");
        System.out.println("Player 2, you have 6 guesses to "+
                            "figure out the answer.");
        //replaces all letters in sentence with *
        for(int i = 0; i < sentence.length(); i++){
            
            if(sentence.charAt(i) >= 65 && sentence.charAt(i) <= 122){
                sentBlanks += "*";
            }else{
                sentBlanks += sentence.charAt(i);
            }
        }
        System.out.println(sentBlanks);
        
        while (sentBlanks.indexOf("*") >= 0 && incorrect < 6){
            System.out.print("Enter a letter or guess the answer: ");
            entry = scan.nextLine();
    //Exits the loop if the player enters something longer than a character.
	// i.e. they made a guess of the answer.
            if (entry.length() > 1)
                break;
            
            //Fill in the code required to make this game work.
            
                
                for(int i = 0; i < sentence.length(); i++){
            
                    if(entry.charAt(0)==sentence.charAt(i)){
                        temp+=entry;
                        
                    }else{
                        temp+=sentBlanks.charAt(i);
                }
            }
            sentBlanks = temp;
            temp="";
            
            System.out.println(sentBlanks);
            
            if(sentence.indexOf(entry)<0){
                System.out.println("Incorrect");
                incorrect++;
            }
            
        }
        
        if(entry.equals(sentence)){
            System.out.println("You won!");
        }else{
            System.out.println("You lost!");
        }
    }
}