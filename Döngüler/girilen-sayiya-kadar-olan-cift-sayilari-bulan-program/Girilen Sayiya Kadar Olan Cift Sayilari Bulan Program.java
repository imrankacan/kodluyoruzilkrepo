import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a,sayac = 0, toplam = 0 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Değer Giriniz: ");
        a = input.nextInt();

        for(int i=0;i<=a;i++){
            //System.out.print(i);
            if((i%3==0)&&(i%4==0)){
                toplam =i+toplam; 
                sayac++;
            }
        }//System.out.print(toplam);
        double ortalama = toplam/(sayac-1); // Sayaç sıfır değerini de dahil ettiği için bir eksiği alınmıştır. 
        System.out.println(ortalama);
         
    } 
}

