//Given a NxN 2-D matrix, the task to find the sum of all the submatrices.

public class javaPractice12
{
    static int matrixSum(int arr[][],int n)
    {
        // Variable to store
        // the required sum
        int sum = 0;
 
        // Nested loop to find the number
        // of submatrices, each number belongs to
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
 
                // Number of ways to choose
                // from top-left elements
                int top_left = (i + 1) * (j + 1);
 
                // Number of ways to choose
                // from bottom-right elements
                int bottom_right = (n - i) * (n - j);
                sum += (top_left * bottom_right * arr[i][j]);
            }
        }
 
        return sum;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // n*n matrices
        int n=3;
        int arr[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        System.out.println(matrixSum(arr,n));
    }
}
