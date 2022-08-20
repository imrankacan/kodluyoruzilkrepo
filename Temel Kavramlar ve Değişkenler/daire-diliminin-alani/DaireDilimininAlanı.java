import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14, a, daireDilimialani;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz:");
        r = input.nextInt();

        System.out.print("Daire Diliminin Açısını Giriniz:");
        a = input.nextInt();

        daireDilimialani = ((pi*(r*r)*a)/360);
        System.out.print("Daire Diliminin Alanı:"+daireDilimialani);
    }
}
