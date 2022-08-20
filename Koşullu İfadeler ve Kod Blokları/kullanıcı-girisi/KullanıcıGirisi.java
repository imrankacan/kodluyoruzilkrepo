import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String userName, password, yeniSifreOlusturma;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz:");
        password = input.nextLine();

        if((userName.equals("imran")) && (password.equals("kacan"))){
            System.out.println("Giriş Yaptınız");
        }else{
            System.out.println("Hatalı Giriş yaptınız. Yeni Şifre Oluşturmak İçin 1 i tuşlayınız.");
            int yeniSifre = input.nextInt();
            switch(yeniSifre){
                case 1:
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Yeni Şifre Giriniz:");
                    yeniSifreOlusturma = input2.nextLine();
                    if(yeniSifreOlusturma.equals("kacan")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                        yeniSifreOlusturma = input2.nextLine();
                    
                    }else{
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
            }
            
        }
    }
}