public class Pascal
{
    public static void main(String[] args)
    {
        int rows = 5;        
        for (int i = 0; i < rows; i++)
        {
            int number = 1;
 
            // Print initial spaces
            for (int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}