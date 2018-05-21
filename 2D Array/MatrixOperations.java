//
//
//
//
//
public class MatrixOperations
{
    public static int[][] add(int[][] a, int[][] b)
    {
        if (a.length != b.length || a[0].length != b[0].length)
        {
            int[][] nums = new int[1][1];
            return nums;
        }
        int[][] answer = new int[a.length][a[0].length];
        for (int row  = 0; row < a.length; row++)
        {
            for (int col = 0; col < a[0].length; col++)
            {
                answer[row][col] = a[row][col] + b[row][col];
            }
        }
        return answer;
    }
    
    public static int[][] subtract(int[][] a, int[][] b)
    {
        if (a.length != b.length || a[0].length != b[0].length)
        {
            int[][] nums = new int[1][1];
            return nums;
        }
        int[][] answer = new int[a.length][a[0].length];
        for (int row  = 0; row < a.length; row++)
        {
            for (int col = 0; col < a[0].length; col++)
            {
                answer[row][col] = a[row][col] - b[row][col];
            }
        }
        return answer;
    }
    
    public static int[][] multiply(int[][] a, int[][] b)
    {
         if(a[0].length != b.length)
        {
            int[][] nums = new int[1][1];
            return nums;
        }
        if (a[0].length == b.length)
        {
            int[][] answer = new int[a[0].length][b.length];
            for(int i = 0; i < a.length; i++)
            {
                for(int j = 0; i < b[0]length; j++)
                {
                    answer[row][col] = ((a[row][col] * b.[row][col]) + a[row][col + 1] * b[row + 1][col]));
                }
                    
            }
            return answer;
            
        }
       
    }
    
}