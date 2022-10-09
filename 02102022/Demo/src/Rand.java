import java.util.Random;

public class Rand {

    public void myMetod() {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt();
        }
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        System.out.println(sum / 20);
    }

}
