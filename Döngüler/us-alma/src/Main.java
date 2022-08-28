import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Taban Sayısını Giriniz: ");
        n = input.nextInt();;
        System.out.printf("Üs Değerini Giriniz: ");
        k = input.nextInt();

        for(int i=1; i<=k; i++){
            //System.out.println(i);
            total *=n;
        }
        System.out.printf("%d^%d = %d", n, k, total);

    }
}