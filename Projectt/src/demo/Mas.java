package demo;//import java.util.Random;

public class Mas {
    public void myMetod2() {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.print("{");
        for (int[] innerArray : array) {
            int x = 0;
            System.out.print("{");
            for (int y : innerArray) {


                if (x < innerArray.length - 1){
                    System.out.print(y + ",");
                } else {
                    System.out.print(y);
                }
                x++;
            }
            System.out.print("}");
            //System.out.print("}");
            System.out.println();
        }
        //System.out.print(r);
        System.out.print("}");
    }
}
