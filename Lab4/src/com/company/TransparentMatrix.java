package com.company;

public class TransparentMatrix extends AbstractMatrixOperation implements Matrix{
    TransparentMatrix(Matrix matrix){
     super(matrix);
    }
   @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return mtx1.getElement(j,i);
    }
}
