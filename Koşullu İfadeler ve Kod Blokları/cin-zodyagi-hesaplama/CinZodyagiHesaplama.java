import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int yil, cinZodyagi;
        String burc = "";
        
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi Yıl Doğdunuz? : ");
        yil = input.nextInt();

        cinZodyagi = yil%12;
        switch (cinZodyagi) {
            case 0:
            burc = "Maymun";
                
                break;
        }
        switch (cinZodyagi) {
            case 1:
            burc = "Horoz";
                        
        break;
        }
    

        switch (cinZodyagi){
            case 2:
            burc = "Köpek";
                
                break;
        }        
        switch (cinZodyagi){ 
            case 3:
            burc = "Domuz";
                        
        break;
        }


        switch (cinZodyagi){
            case 4:
            burc = "Fare";
                
                break;
        }        
        switch (cinZodyagi){ 
            case 5:
            burc = "Öküz";
                        
        break;
        }

        
        switch (cinZodyagi){ 
            case 6:
            burc = "Kaplan";
                
                break;
        }        
        switch (cinZodyagi){ 
            case 7:
            burc = "Tavşan";
                        
        break;
        }

        switch (cinZodyagi){ 
            case 8:
            burc = "Ejderha";
                
                break;
        }        
        switch (cinZodyagi){ 
            case 9:
            burc = "Yılan";
                        
        break;
        }


        switch (cinZodyagi){ 
            case 10:
            burc = "At";
                
                break;
        }        
        switch (cinZodyagi){ 
            case 11:
            burc = "Koyun";
                        
        break;
                

            default:
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz : "+burc);


    }
}