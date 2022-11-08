import java.util.ArrayList;
import java.util.Random;
import org.example.task1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task1Test {

    public static final int ARRAY_SIZE = 10;

    @Test
    public void testIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task1.filter(null));
    }

    @Test
    public void testIsEmpty() {
        int[] res = Task1.filter(new int[0]);
        Assertions.assertArrayEquals(new int[] {}, res);
        Assertions.assertEquals(0, res.length);
    }

    @Test
    public void testAllPositive() {
        int[] input = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            input[i] = i;
        }
        int[] res = Task1.filter(input);
        Assertions.assertArrayEquals(input, res);
    }

    @Test
    public void testAllNegative() {
        int[] input = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            input[i] = -(ARRAY_SIZE + i);
        }
        int[] expected = {};
        int[] res = Task1.filter(input);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void test50v50() {
        int[] input = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i % 2 == 0) {
                input[i] = (ARRAY_SIZE + i);
            } else {
                input[i] = -(ARRAY_SIZE + i);
            }
        }
        int[] expected = {10, 12, 14, 16, 18};
        int[] res = Task1.filter(input);
        Assertions.assertArrayEquals(expected, res);
    }

    @Test
    public void testAllRandom() {
        int[] input = new int[ARRAY_SIZE];
        Random random = new Random();
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            input[i] = random.nextInt(-10, 10);
            if (input[i] >= 0) {
                expected.add(input[i]);
            }
        }
        int[] res = Task1.filter(input);
        Assertions.assertArrayEquals(expected.stream().mapToInt((i) -> i).toArray(), res);
    }
}
