import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;

public class App {

    static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {

        int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];
        Random r = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                array[i][j] = r.nextInt(1000);
            }
        }

        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));

        int[] maxWithIndex = getMax(array);

        System.out.println("The maximum number in the array is " + maxWithIndex[0] + " at position (" + maxWithIndex[1]
                + ", " + maxWithIndex[2] + ")");
    }

    public static int[] getMax(int[][] array) {
        int result = -1;
        Integer[] coords = new Integer[] { 0, 0 };
        HashMap<Integer, Integer[]> map = new HashMap<>();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                    coords[0] = i;
                    coords[1] = j;
                    map.put(Integer.valueOf(result), coords);
                }
            }
        }

        return new int[] { result, coords[0], coords[1] };
    }
}
