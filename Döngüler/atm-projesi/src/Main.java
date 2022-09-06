import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Yatırmak İstediğiniz Tutarı Giriniz:");
                        int price = input.nextInt();
                        balance += price;
                        break;
                }
                switch (select){
                    case 2:
                        System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                        int price = input.nextInt();
                        if(price > balance){
                            System.out.print("Hatalı Tutat");
                        }else{
                            balance -= price;
                        }

                        break;
                }
                switch (select){
                    case 3:
                        System.out.print("Bakiyeniz: "+balance);
                        break;
                }
                switch (select){
                    case 4:
                        System.out.print("Tekrar Görüşmek Üzere.");
                    break;
                }
                break;
            } else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}