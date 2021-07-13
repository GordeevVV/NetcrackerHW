package com.company;

public class Main {
    public static void main(String args[]){
        int[][] mtx={{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int[][] mtx1={{6,4,3,17}, {7,5,10,11}, {18,1,20,3}};
        Matrix matrix1=new MatrixImpl(mtx);
        Matrix matrix2=new MatrixImpl(mtx1);
        AbstractMatrixOperation sum=new SumOfTwoMatrices(matrix1,matrix2);
        System.out.println("Sum of two matrices");
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++)
                System.out.print(sum.getElement(i,j)+"\t");
            System.out.print("\n");
        }
        int[][] mtx2={{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{1,2,4,6}};
        Matrix matrix3=new MatrixImpl(mtx2);
        AbstractMatrixOperation transpar =new TransparentMatrix(matrix3);
        System.out.println("Transparent of third matrix");
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++)
                System.out.print(transpar.getElement(i,j)+"\t");
            System.out.print("\n");
        }
    }
}
