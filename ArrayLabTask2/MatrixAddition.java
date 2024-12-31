package ArrayLabTask2;

public class MatrixAddition {
    public static void main(String[] args) {
        int [][] mat1 ={{1,2,3},{4,5,6}};
        int [][] mat2 ={{4,5,6},{1,2,3}};
        int [][] mat3 =new int[2][3];
        System.out.println("Matrix A: ");
        for(int r = 0; r <2; r++){
            for (int c=0; c<3; c++){
                System.out.print(mat1[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B: ");
        for(int r = 0; r <2; r++){
            for (int c=0; c<3; c++){
                System.out.print(mat2[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix C: ");
        for(int r = 0; r <2; r++){
            for (int c=0; c<3; c++){
                mat3[r][c]=mat1[r][c] + mat2 [r][c];
                System.out.print(mat3[r][c]+" ");
            }
            System.out.println();
        }
    }




}
