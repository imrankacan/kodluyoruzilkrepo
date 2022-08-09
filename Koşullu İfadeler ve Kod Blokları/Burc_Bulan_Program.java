import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int ay, gün;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı Ayda Doğdunuz? : ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        gün = input.nextInt();

        if(ay==1){
            if(1<=gün&&gün<=31){
                if(gün<22){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }else{
                isError = true;
            }

        }else if(ay==2){
            if(1<=gün&&gün<=28){
                if(gün<20){
                    burc = "Kova";
                }else{
                    burc = "Balık";
                }
            }else{
                isError = true;
            }

        }else if(ay==3){
            if(1<=gün&&gün<31){
                if(gün<21){
                    burc = "Balık";
                }else{
                    burc = "Koç";
                }
            }else{
                isError = true;
            }

        }else if(ay==4){
            if(1<=gün&&gün<=30){
                if(gün<21){
                    burc = "Koç";
                }else{
                    burc = "Boğa";
                }
            }else{
                isError = true;
            }

        }else if(ay==5){
            if(1<=gün&&gün<=31){
                if(gün<22){
                    burc = "Boğa";
                }else{
                    burc = "İkizler";
                }
            }else{
                isError = true;
            }

        }else if(ay==6){
            if(1<=gün&&gün<=30){
                if(gün<23){
                    burc = "İkizler";
                }else{
                    burc = "Yengeç";
                }
            }else{
                isError = true;
            }

        }else if(ay==7){
            if(1<=gün&&gün<=31){
                if(gün<23){
                    burc = "Yengeç";
                }else{
                    burc = "Aslan";
                }
            }else{
                isError = true;
            }

        }else if(ay==8){
            if(1<=gün&&gün<=31){
                if(gün<23){
                    burc = "Aslan";
                }else{
                    burc = "Başak";
                }
            }else{
                isError = true;
            }

        }else if(ay==9){
            if(1<=gün&&gün<=30){
                if(gün<23){
                    burc = "Başak";
                }else{
                    burc = "Terazi";
                }
            }else{
                isError = true;
            }

        }else if(ay==10){
            if(1<=gün&&gün<=30){
                if(gün<23){
                    burc = "Terazi";
                }else{
                    burc = "Akrep";
                }
            }else{
                isError = true;
            }

        }else if(ay==11){
            if(1<=gün&&gün<=30){
                if(gün<22){
                    burc = "Akrep";
                }else{
                    burc = "Yay";
                }
            }else{
                isError = true;
            }

        }else if(ay==12){
            if(1<=gün&&gün<=31){
                if(gün<22){
                    burc = "Yay";
                }else{
                    burc = "Oğlak";
                }
            } else{
                isError = true;
            }
        }else{
            isError = true;
        }

        if(isError){
            System.out.println("Hatalı Giriş.");
        }else{
            System.out.println("Burcunuz:" +burc);
        }

        

    }
}

