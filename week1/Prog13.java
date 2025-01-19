import java.util.Scanner;

class Matrix{
    int m[][];

    Matrix(int rows, int cols)
    {
        this.m = new int[rows][cols];
    }
    
    public void createMatrix(Scanner S)
    {
        
        for(int i = 0; i < this.m.length; i++)
        {
            System.out.printf("Enter %d elements for the %d th row of the matrix: ", this.m[i].length, i + 1);
            for(int j = 0; j < this.m[i].length; j++)
            {
                int num = S.nextInt();
                this.m[i][j] = num;
            }
        }
    }

    public void printMatrix()
    {
        for (int[] rows : this.m) {
            for (int cols : rows) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    public Matrix addMatrix(Matrix B)
    {
        if(this.m.length != B.m.length || this.m[0].length != B.m[0].length)
            return null;

        else
        {
            Matrix addM = new Matrix(this.m.length, this.m[0].length);
            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    addM.m[i][j] = this.m[i][j] + B.m[i][j];
                }
            }
            return addM;
        }
    }

    public Matrix multiplyMatrix(Matrix B)
    {
        int rowsA = this.m.length;
        int colsA = this.m[0].length;
        int rowsB = B.m.length;
        int colsB = B.m[0].length;

        if (colsA != rowsB) return null;

        Matrix C = new Matrix(rowsA, colsB);

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C.m[i][j] += this.m[i][k] * B.m[k][j];
                }
            }
        }
        return C;
    }
}


public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows of the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of the first matrix: ");
        int c1 = sc.nextInt();
        Matrix M1 = new Matrix(r1, c1);
        M1.createMatrix(sc);
        M1.printMatrix();
        
        
        System.out.print("Enter number of rows of the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of the second matrix: ");
        int c2 = sc.nextInt();
        Matrix M2 = new Matrix(r2, c2);
        M2.createMatrix(sc);
        M2.printMatrix();

        Matrix addM = M1.addMatrix(M2);
        addM.printMatrix();

        Matrix mulM = M1.multiplyMatrix(M2);
        mulM.printMatrix();
        
        sc.close();
    }
}
