package com.company;

public class SumOfTwoMatrices extends AbstractMatrixOperation{
    SumOfTwoMatrices(Matrix matrix1, Matrix matrix2) {
        super(matrix1,matrix2);
    }
    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return mtx1.getElement(i,j)+mtx2.getElement(i,j);
    }
}
