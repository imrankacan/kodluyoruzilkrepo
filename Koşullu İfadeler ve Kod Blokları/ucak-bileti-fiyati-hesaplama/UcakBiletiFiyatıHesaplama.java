import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double mesafeHesap, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz:");
        mesafe = input.nextInt();
        mesafeHesap = mesafe*(0.10);
        
        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextInt();

        System.out.print("1- Tek Yön \n2- Gidiş-Dönüş \nYolculuk Tipini Seçiniz:");
        yolculukTipi = input.nextInt();
        
        if(yas>=0&&mesafe>0){
            if(yolculukTipi==2){
                if(yas<=12){
                    toplamTutar = 2*((mesafeHesap-mesafeHesap/2)-((mesafeHesap-mesafeHesap/2)*0.2));
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else if(yas>12&&yas<=24){
                    toplamTutar = 2*((mesafeHesap-(mesafeHesap*0.1))-((mesafeHesap-(mesafeHesap*0.1))*0.2));
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else if(yas>=65){
                    toplamTutar = 2*((mesafeHesap-(mesafeHesap*0.3))-((mesafeHesap-(mesafeHesap*0.3))*0.2));
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else{
                    toplamTutar = 2*((mesafeHesap-(mesafeHesap*0.2)));
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }


            }else{
                if(yas<=12){
                    toplamTutar = mesafeHesap-(mesafeHesap/2);
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else if(yas>12&&yas<=24){
                    toplamTutar = mesafeHesap-(mesafeHesap*0.1);
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else if(yas>=65){
                    toplamTutar = mesafeHesap-(mesafeHesap*0.3);
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }else{
                    toplamTutar = mesafeHesap;
                    System.out.println("Ödeyeceğiniz Tutar: "+toplamTutar);
                }

            }
        }else{
            System.out.println("Hatalı Veri Girdiniz.");
        }

    }
}

