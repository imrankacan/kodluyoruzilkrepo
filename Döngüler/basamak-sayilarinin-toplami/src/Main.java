import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basValue, basToplam = 0;

        while (number != 0) {
            basValue = number % 10;
            basToplam += basValue;
            number /= 10;
        }System.out.println(basToplam);
    }
}