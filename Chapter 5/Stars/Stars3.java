//****************************************************************************
//
//
//
//****************************************************************************
public class Stars3
{
    public static void main(String[] args)
    {
    for (int row = 1; row <= 10; row++)
        {
            for (int space = 10; space > row; space--)
            {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}