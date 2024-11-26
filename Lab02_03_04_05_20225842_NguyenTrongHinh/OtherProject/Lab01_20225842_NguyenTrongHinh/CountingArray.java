import java.util.Arrays;
import java.util.Scanner;

public class CountingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Nhap so phan tu cua mang : ");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.print(" So phan tu cua mang khong hop le");
            return;
        }
        double[] arr = new double[n]; 

        for (int i=0;i<n;i++){
            System.out.print("Input arr["+i+"]: ");
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
            // Tinh tong 
        double sum = 0;
        for (int i=0;i<n;i++){ 
            sum += arr[i];
        }
        //Tìm số trung bình cộng của các giá trị phần tử trong mảng
        double avg = sum/n;

        //In các kết quả yêu cầu
        System.out.println("\n\nMang sau khi đa sap xep tu be đen lon: ");
        for (double i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nTong cac phan tu trong mang: "+sum);
        System.out.print("Trung binh cong cac gia tri trong mang: "+avg);
    }
}