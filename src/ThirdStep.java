import java.util.Scanner;

public class ThirdStep {
    public static void main(String[] args) {
        int n = 10;
        double[] mas = new double[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]=");
            while (!sc.hasNextDouble()) {
                sc.nextLine();
                System.out.print("mas[" + i + "]=");
            }
            mas[i] = sc.nextDouble();
        }

        for(int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i] + " ");
        }
        System.out.println();
    }
}
