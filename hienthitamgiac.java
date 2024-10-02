import java.util.Scanner;

public class hienthitamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Input n : ");
        int n = sc.nextInt();

        for(int i=n ; i>=1 ; i--){
            for(int j=n ; j >= n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k <= 2*(n-i) +1 ; k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }    
}
