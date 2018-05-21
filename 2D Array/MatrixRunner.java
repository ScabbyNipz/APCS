public class MatrixRunner
{
    public static void main(String[] args)
    {
        int [][] a = {{2,3},{4,7}};
        int [][] b = {{4,5},{6,7}};
        
        int[][] addAnswer = MatrixOperations.add(a,b);
        
        for(int row  = 0; row < addAnswer.length; row++)
        {
            for(int col = 0; col < addAnswer[0].length; col++)
            {
                System.out.print(addAnswer[row][col] + "\t");
            }
            System.out.println();
        }
        
    }
}