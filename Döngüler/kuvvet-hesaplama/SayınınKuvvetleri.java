import java.util.Scanner;

class Main{
    static void printPowers(int n, int power){

        int number = 1;
        for (int i = 1; i<= power; i++){
            number *=n;
            System.out.printf("%d. power of %d: %d %n", i, n, number);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int k = input.nextInt();

        printPowers(4, k);
        printPowers(5, k);



        
    } 
}