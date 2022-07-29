import java.util.Scanner;
class Main {

public static void main(String[] args) {
    double fiyat, kdvliTutar, kdvTutarı, kdvTutarı2, toplamTutar; 
    Scanner input = new Scanner(System.in);
    System.out.print("Ürün Fiyatını Giriniz:");
    fiyat = input.nextDouble();

    boolean kosul1 = fiyat<=1000;
    kdvTutarı = fiyat*(0.18);
    kdvTutarı2 = fiyat*(0.8);

    kdvliTutar = kosul1 ? kdvTutarı : kdvTutarı2;
    toplamTutar = kdvTutarı+fiyat;
    System.out.println("Toplam Tutar"+toplamTutar);

    
  }
    
}