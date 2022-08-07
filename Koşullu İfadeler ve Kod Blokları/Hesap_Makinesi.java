import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n1, n2, tercih;
        

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci tam sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem tercihi yapınız:");
        tercih = input.nextInt();

        switch (tercih) {
            case 1:
                System.out.print("Sonuç:"+(n1+n2));
                break;
            case 2:
                System.out.print("Sonuç:"+(n1-n2));
                break;    

            case 3:
                System.out.print("Sonuç:"+(n1/n2));

                break;
            case 4:
                if (n2==0){
                    System.out.println("Bir sayı sıfıra bölünemez. Tekrar işlem yapınız.");
                }else{
                    System.out.print("Sonuç:"+(n1*n2));
                }
                
                break;

        
            default:
            System.out.print("Yanlış Giriş Yaptınız");

                break;
        }






    }
}