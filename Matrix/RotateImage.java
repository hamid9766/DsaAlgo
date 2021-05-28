package DsaAlgo.Matrix;

import java.util.Arrays;

public class RotateImage {
    public static int[][] rotate(int[][] matrix) {

        // this loop will transpose the matrix i.e row to col
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // this loop will reverse the elements of particular row
        // working as a two pointer approach
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }

        }
        return matrix;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));
    }
}
