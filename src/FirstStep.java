import java.util.Scanner;

public class FirstStep {
    public static void main(String[] args) {
        double[] ar = new double[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<ar.length; i++){
            System.out.print("ar[" + i + "]=>");
            ar[i] = sc.nextDouble();
        }
        System.out.println();

        for (int i=0; i<ar.length; i++){
            System.out.println(">arr[" + i + "]=" + ar[i]);
        }
        System.out.println();

        for (int i=0; i<ar.length; i++){
            System.out.print("arr[" + i + "]=" + ar[i] + "; ");
        }
        System.out.println();
    }
}
