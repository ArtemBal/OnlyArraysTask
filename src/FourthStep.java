import java.util.Random;

public class FourthStep {
    public static void main(String[] args) {
        int n = 10;
        double[] mas = new double[n];
        double sum = 0.0;

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextDouble();
        }

        for(int i=0; i< mas.length; i++) {
            sum = sum + mas[i];
        }

        for(int i = 0; i < mas.length; i++) {
            if(i == mas.length - 1) {
                System.out.printf("%4.2f \n", mas[i]);
            }else {
                System.out.printf("%4.2f, ", mas[i]);
            }
        }
        System.out.printf("sum = %4.2f \n", sum);
    }
}
