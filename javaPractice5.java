import java.util.Scanner;

// adding two matrix
// passing array in methods

class Matrix{
    int arr[][];
    int r, c;

    Matrix(int r, int c){
        this.r=r;
        this.c=c;
        arr=new int[r][c];
    }

    //getting matrix from user
    int[][] getMatrix(){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    //finding sum of matrix
    int [][] sum(int x[][], int y[][]){
        int temp[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[i][j]=x[i][j] + y[i][j];
            }
        }
        return temp;
    }

    //display matrix
    void display(int result[][]){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class javaPractice5 {
    public static void main(String[] args) {
        Matrix obj1=new Matrix(3, 3);
        Matrix obj2=new Matrix(3, 3);
        int a[][],b[][];
        System.out.println("Enter the first matrix: ");
        a=obj1.getMatrix();
        System.out.println("Enter the second matrix: ");
        b=obj2.getMatrix();
        System.out.println("Sum of  matrix: ");
        obj2.display(obj1.sum(a, b));        
        
    }
    
}
