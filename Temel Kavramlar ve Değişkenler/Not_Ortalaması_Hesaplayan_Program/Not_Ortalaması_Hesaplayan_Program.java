import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Matematik Notunuzu Giriniz:");
    int mat = input.nextInt();
    //System.out.println(mat);

    System.out.print("Fizik Notunuzu Giriniz:");
    int fizik = input.nextInt();

    System.out.print("Kimya Notunuzu Giriniz:");
    int kimya = input.nextInt();

    System.out.print("Biyoloji Notunuzu Giriniz:");
    int biyoloji = input.nextInt();

    double ort = (mat+fizik+kimya+biyoloji)/4;
    boolean gecme = ort >=60 ;

    String str = gecme ? "Geçtiniz." : "Kaldınız." ;

    System.out.println(str);
    

  
  }
}