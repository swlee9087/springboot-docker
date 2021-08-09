package com.example.UserService.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Matrix {
    public int[][] createMatrix(int row, int col) {
//        int[][]matrix = new int[row][col];
//        int k=1;
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                matrix[i][j]=k;
//                k++;
//            }
//        }
//        return matrix;

//        int[][]matrix = new int[][];
//        int k=1;
//        for(int i=0;i<row;i++){
//            for(int j=0; j<col;j++){
//                matrix[i][j]=k;
//                k++;
//            }
//        } return matrix;
//        int[][]matrix=new int[row][col];
//        int k=1;
//        for(int i =0;i<row;i++){
//            for(int j=0;j<col;j++){
//                matrix[i][j]=k;
//                k++;
//            }
//        }
//        return matrix;
        int[][]matrix=new int[row][col];
        int k=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=k;
                k++;
            }
        }
        return matrix;
    }

}
