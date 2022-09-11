import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Bir Sayı Giriniz: ");
        a = input.nextInt();

        for (int i=1; i<=a; i++){
            if (a%i==0){
                toplam+=i;
            }
        }
        toplam-=a;
        if (toplam==a){
            System.out.printf("%d = Mükemmel Sayıdır.", a);
        }else {
            System.out.printf("%d Mükemmel Sayı Değildir.", a);
        }
    }
}