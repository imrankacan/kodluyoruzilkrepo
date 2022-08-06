import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        double kilo, boy, vücutKitleIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz:");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz:");
        kilo = input.nextDouble();

        vücutKitleIndeksi = (kilo/(boy*boy));
        System.out.print("Vücut Kitle İndeksiniz:"+vücutKitleIndeksi);


    }
}
