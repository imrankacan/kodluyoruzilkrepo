import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int yil;


        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if(yil%4==0){
            if((yil%100==0)){
                if(yil%400==0){
                    System.out.println(yil+ " Artık Yıldır.");
                }else{
                    System.out.println(yil+ " Artık Yıl Değildir.");
                    return;
                }    
            }
            System.out.println(yil+ " Artık Yıldır.");
        }else{
            System.out.println(yil+ " Artık Yıl Değildir.");
        }


    }
}