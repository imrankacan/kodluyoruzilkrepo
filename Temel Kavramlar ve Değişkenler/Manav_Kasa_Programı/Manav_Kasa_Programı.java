import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.00, toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo:");
        double armutKg = input.nextDouble();
        double armutTutar = armut*armutKg;

        System.out.print("Elma Kaç Kilo:");
        double elmaKg = input.nextDouble();
        double elmaTutar = elma*elmaKg;

        System.out.print("Domates Kaç Kilo:");
        double domatesKg = input.nextDouble();
        double domatesTutar = domates*domatesKg;

        System.out.print("Muz Kaç Kilo:");
        double muzKg = input.nextDouble();
        double muzTutar = muz*muzKg;

        System.out.print("Patlıcan Kaç Kilo:");
        double patlıcanKg = input.nextDouble();
        double patlıcanTutar = patlıcan*patlıcanKg;

        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlıcanTutar;
        System.out.print("Toplam Tutar:"+toplamTutar);


    }
}
