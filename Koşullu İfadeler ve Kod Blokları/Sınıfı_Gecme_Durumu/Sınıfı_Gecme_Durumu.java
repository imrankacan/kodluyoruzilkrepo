import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int matematik, fizik, türkce, kimya, müzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunu Giriniz:");
        matematik = input.nextInt();

        System.out.print("Lütfen Fizik Notunu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Lütfen Türkçe Notunu Giriniz:");
        türkce = input.nextInt();

        System.out.print("Lütfen Kimya Notunu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Lütfen Müzik Notunu Giriniz:");
        müzik = input.nextInt();

        ortalama = (matematik+fizik+türkce+kimya+müzik)/5;

        if(ortalama>=0&&ortalama<=100){
            if(ortalama<55){
                System.out.println("Kaldınız!");
            }else{
                System.out.println("Geçtiniz!");
            }
        }else{
            System.out.print("Hatalı Giriş Yaptınız.");
        }


    }
}