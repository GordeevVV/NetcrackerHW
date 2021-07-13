package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    @Test
    public void sum_Of_Matrices(){
        int[][] mtx={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] mtx1={{6,4,3,17}, {7,5,10,11}, {18,1,20,3}};
        int[][] mtxres={{11,11,6,34}, {14,5,11,23}, {26,2,22,6}};
        Matrix matrix1= new MatrixImpl(mtx);
        Matrix matrix2= new MatrixImpl(mtx1);
        Matrix matrixres=new MatrixImpl(mtxres);
        AbstractMatrixOperation sum=new SumOfTwoMatrices(matrix1,matrix2);
        Assert.assertEquals(sum.getElement(1,1),matrixres.getElement(1,1));
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void sum_Of_Wrong_Matrices() throws ArrayIndexOutOfBoundsException{
        int[][] mtx={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] mtx1={{6,4,3}, {7,5,11}, {18,1,20,3}};
        Matrix matrix1= new MatrixImpl(mtx);
        Matrix matrix2= new MatrixImpl(mtx1);
        AbstractMatrixOperation sum=new SumOfTwoMatrices(matrix1,matrix2);
        sum.getElement(3,1);
    }
    @Test
    public void transparent_Of_Matrices(){
        int[][] mtx={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] mtx1={{6,4,3,17}, {7,5,10,11}, {18,1,20,3}};
        int[][] mtxres={{11,11,6,34}, {14,5,11,23}, {26,2,22,6}};
        Matrix matrix1= new MatrixImpl(mtx);
        Matrix matrix2= new MatrixImpl(mtx1);
        Matrix matrixres=new MatrixImpl(mtxres);
        AbstractMatrixOperation sum=new SumOfTwoMatrices(matrix1,matrix2);
        Assert.assertEquals(sum.getElement(1,1),matrixres.getElement(1,1));
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void transparent_Of_Wrong_Matrices() throws ArrayIndexOutOfBoundsException{
        int[][] mtx={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        Matrix matrix1= new MatrixImpl(mtx);
        AbstractMatrixOperation transparent=new TransparentMatrix(matrix1);
        transparent.getElement(0,3);
    }
}
