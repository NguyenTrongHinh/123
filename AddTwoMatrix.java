import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" HinhNT - Nhap sa hang cua ma tran: ");
        int row = sc.nextInt();
        System.out.print(" HinhNT - Nhap so cot cua ma tran: ");
        int col = sc.nextInt();

        double[][] matA = new double[row][col]; 
        double[][] matB = new double[row][col]; 
        double[][] matAns = new double[row][col]; 

        System.out.println("\nHay nhap cac phan tu trong ma tran A: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nHay nhap cac phan tu trong ma tran B: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j] = sc.nextDouble();
            }
        }

        //Tính matA + matB
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matAns[i][j] = matA[i][j] + matB[i][j];
            }
        }

        //In kết quả
        System.out.println("\n");
        System.out.println("Ket qua matA + matB la: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matAns[i][j]+" ");
            }
            System.out.println();
        }
    }
}