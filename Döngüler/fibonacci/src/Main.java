public class Main {
    public static void main(String[] args) {
        int total, firstStep = 0, secondStep = 1;
        System.out.printf("First Value : %d %nSecond Value : %d %n", firstStep, secondStep);
        for (int i = 1; i < 9; i++) {
            //System.out.println("i = "+i);
            total=firstStep+secondStep;
            System.out.printf("%d + %d : %d %n",firstStep, secondStep, total);
            firstStep = secondStep;
            secondStep = total;


        }
    }
}