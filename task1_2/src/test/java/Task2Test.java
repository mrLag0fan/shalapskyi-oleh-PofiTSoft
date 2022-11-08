import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.example.task1.Task1;
import org.example.task2.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    public void testIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Task2.countHashtags(null));
    }

    @Test
    public void testIsEmpty() {
        HashMap<String, Integer> res = Task2.countHashtags(new ArrayList<>());
        Assertions.assertEquals(res, new HashMap<>());
        Assertions.assertEquals(0, res.size());
    }

    @Test
    public void testNoRepeats() {
        HashMap<String, Integer> res = Task2.countHashtags(
            List.of("#aaa#bbb#ccc#ddd", "#aaa#bbb#ccc#ddd", "##aaa#bbb#ccc#ddd"));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("aaa", 3);
        expected.put("bbb", 3);
        expected.put("ccc", 3);
        expected.put("ddd", 3);
        Assertions.assertEquals(expected, res);
        Assertions.assertEquals(4, res.size());
    }

    @Test
    public void testWithRepeats() {
        HashMap<String, Integer> res = Task2.countHashtags(
            List.of("#aaa#aaa#bbb#ccc#ddd", "#aaa#bbb#ccc#bbb#ddd", "#ccc#aaa#bbb#ccc#ddd"));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("aaa", 3);
        expected.put("bbb", 3);
        expected.put("ccc", 3);
        expected.put("ddd", 3);
        Assertions.assertEquals(expected, res);
        Assertions.assertEquals(4, res.size());
    }
}
