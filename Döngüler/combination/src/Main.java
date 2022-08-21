import java.util.Scanner;
public class Main {
    static void printCombination(int n, int r){
        int toplam = 1;
        for (int i=1; i<=n; i++){
            toplam *=i; //n!
            //System.out.printf("%d! = %d dir. %n", i, toplam);
        }
        int toplam2 = 1;
        for (int i=1; i<=r; i++){
            toplam2 *=i; //r!
            //System.out.printf("%d! = %d dir. %n", i, toplam2);
        }
        int toplam3 = 1;
        for (int i=1; i<=(n-r); i++){
            toplam3 *=i; //(n-r)!
            //System.out.printf("%d! = %d dir. %n", i, toplam3);
        }
        int c = toplam/(toplam2*toplam3);
        System.out.printf("%d'nin %d'li Kombinasyonu: %d", n, r, c);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Kombinasyon Hesabı Yapılacak Kümenin Eleman Sayısını Giriniz: ");
        int n = input.nextInt();

        System.out.printf("Kaç Elamanlı Gruplar Oluşturulacağını Giriniz: ");
        int r = input.nextInt();

        printCombination(n,r);

    }
}