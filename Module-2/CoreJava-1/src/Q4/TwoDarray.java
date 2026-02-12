package Q4;
import java.util.Scanner;
public class TwoDarray {

    static void main() {
        Scanner in = new Scanner(System.in);
        int row,col;

        System.out.println("Enter the number of rows and colums ");
        row = in.nextInt();
        col = in.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0;i< row ;i++)
        {
            for(int j = 0;j<col;j++)
            {
            arr[i][j] = i+j;
            }
        }
        System.out.println("Generated 2D array ");
        for(int i = 0;i< row ;i++)
        {

            for(int j = 0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("ROW sum");
        for(int i = 0;i< row ;i++)
        {
            int rowSum = 0;
            for(int j = 0;j<col;j++)
            {
                rowSum+=arr[i][j];
            }
            System.out.println("Su  m of row "+i+ " "+rowSum);
        }

        System.out.println("COLUMN sum");
        for (int i = 0; i < col; i++) {
            int colSum = 0;
            for (int j = 0; j < row; j++) {
                colSum += arr[j][i];
            }
            System.out.println("Sum of col " + i + " " + colSum);
        }
    }
}
