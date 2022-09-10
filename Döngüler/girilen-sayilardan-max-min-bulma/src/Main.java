import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, k, j, max = 0, min =0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();

        System.out.printf("1. sayıyı giriniz: ");
        j = input.nextInt();
        max = j;
        min = j;

        for (int i=2; i<=n; i++){
            k = i;
            System.out.printf("%d . sayıyı giriniz: ", k);
            j = input.nextInt();

            if(j>max){
                max = j;
            }
            if (j<min){
                min = j;
            }
        }
        System.out.printf("En Büyük Sayı: %d", max);
        System.out.printf("%nEn Küçük Sayı: %d", min);
    }
}