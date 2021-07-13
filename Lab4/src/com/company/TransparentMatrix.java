package com.company;

public class TransparentMatrix extends AbstractMatrixOperation{
    private Matrix mtx;
    TransparentMatrix(Matrix matrix){
     mtx=matrix;
    }
    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return mtx.getElement(j,i);
    }
}
