/*Toeplitz Matrix
it is als called Diagonal constatnt matrix
a toeplitz matrix is may or may not be a square matrix
in this matrix all the diagonal elemets are same
eg.
    |1  2   3   4|
    |5  1   2   3|
    |9  5   1   2| 3X4
*/
package com.just;
/* Given a n X n matrix , I want to find wheater it is a torplitxMatrix or not*/

public class ToeplitzMatrix
{
    public boolean isToeplitzMatrix(int[][] matrix)
    {
        for(int row=0; row<matrix.length-1;row++)
        {
            for(int col=0;col<matrix[row].length-1;col++)
            {
                if(matrix[row][col]!=matrix[row+1][col+1])
                {
                    //if both are not equal then false called failfalse methode when the entire code is not check
                    return false;
                }

            }
        }
        return true;
    }
    // if not to make object use static
    private static void print2DMatrix(int[][] matrix )
    {
        System.out.println("Test matrix:\n");
        for(int[] row:matrix)
        {
            for(int valInRow : row)
            {
                System.out.print(valInRow+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg)
    {
        ToeplitzMatrix toeplitzMatrix=new ToeplitzMatrix();

        int[][] testcase1={{1,2,3},{4,5,6},{7,8,9}};
        print2DMatrix(testcase1);
        System.out.println("Is TestCase1 matrix a Toeplitz :"+ toeplitzMatrix.isToeplitzMatrix((testcase1)));

        int[][] testcase2={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        print2DMatrix(testcase2);
        System.out.println("Is TestCase1 matrix a Toeplitz :"+ toeplitzMatrix.isToeplitzMatrix((testcase2)));
    }
}
