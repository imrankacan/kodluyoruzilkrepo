import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            for(int j=0; j<(n-i); j++){
                System.out.print(" ");
            }
            for (int p=1; p<= ((2*i)-1); p++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=(n-1); i>=0; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k=((2*i)-1); k>=1; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}