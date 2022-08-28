import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        n = input.nextInt();

        double sonuc = 0;
        for (int i = 1; i<=n; i++){
            sonuc += (1.0/i);
        }
        System.out.println("Toplam Değer:" +sonuc);
    }
}






