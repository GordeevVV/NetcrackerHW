package com.company;


public abstract class AbstractMatrixOperation implements Matrix{
    protected Matrix mtx1;
    protected Matrix mtx2;
    public AbstractMatrixOperation(Matrix matrix1,Matrix matrix2){
        mtx1=matrix1;
        mtx2=matrix2;
    }
    public AbstractMatrixOperation(Matrix matrix){
        mtx1=matrix;
    }
    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return mtx1.getElement(i,j);
    }
}
