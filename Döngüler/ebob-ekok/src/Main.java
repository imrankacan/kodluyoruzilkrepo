import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();

        int c = (a*b);
        while (c>0){

            if((a%c==0)&&(b%c==0)){
                System.out.printf("EBOB: %d",c);
                break;
            }
            c--;
        }
        System.out.printf("%nEKOK: " + (a*b)/c);
    }
}