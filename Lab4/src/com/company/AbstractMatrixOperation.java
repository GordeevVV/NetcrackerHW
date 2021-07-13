package com.company;


public abstract class AbstractMatrixOperation implements Matrix{
    protected Matrix res;
    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return res.getElement(i,j);
    }
}
