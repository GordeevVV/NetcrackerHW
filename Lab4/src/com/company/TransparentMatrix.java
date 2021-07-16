package com.company;

public class TransparentMatrix extends AbstractMatrixOperation{
    TransparentMatrix(Matrix matrix){
     super(matrix);
    }
    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return super.getElement(j,i);
    }
}
