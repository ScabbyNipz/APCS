//
public class Mancala
{
    private static final int boardSize = 14;
    private static final int store1 = boardSize/2;
    private static final int store2 = 0;
    
    public Mancala(int n)
    {
        int[] board= new int[boardSize];
        for (int i = 0; i < boardSize; i++)
        {
            if(i != 0 || i != 7)
            {
                board[i] = n;
            }
        }
        
    }
    
    public boolean move(int k)
    {
        int seeds = board[k];
        board[k] = 0;
        for (int i = seeds; i < board[k + seeds]; i++)
        {
            
        }
    }
}