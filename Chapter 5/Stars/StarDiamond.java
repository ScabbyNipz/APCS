//*****************************************************************************
// 
//
//
//
//*****************************************************************************
public class StarDiamond
{
    public static void main(String[] args)
    {
    for (int row = 1; row <= 5; row++)
        {
            for (int space = 5; space > row; space--)
            {
                System.out.print(" ");
            }
            for (int stars = row*2-1; stars > 0; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    for (int row = 4; row >= 1; row--)
        {
            for (int space = 5 -row; space > 0; space--)
            {
                System.out.print(" ");
            }
            for (int stars = row*2-1; stars > 0; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}