import java.util.Random;

public class SecondStep {
    public class Main {
        public static void main(String[] args) {
            int[] ar = new int[5];
            Random rand = new Random();

            for(int i=0; i<ar.length; i++){
                ar[i] = rand.nextInt(1000);
            }

            for (int i=0; i<ar.length; i++){
                System.out.print("arr[" + i + "]=" + ar[i] + "; ");
            }
            System.out.println();
        }
    }
}
