import java .util.*;
public class matrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter the number of rows and column");
        row=s.nextInt();
        col=s.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int c[][]=new int[row][col];
        System.out.println("Enter the elements of first array");
        for (i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of second array");
        for (i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        for (i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}