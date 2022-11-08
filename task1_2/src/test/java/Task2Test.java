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
            List.of("#aaa#bbb#ccc#ddd#fff#eee", "#aaa#bbb#ccc#ddd#eee#fff", "#aaa#bbb#ccc#ddd#eee#fff"));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("aaa", 3);
        expected.put("bbb", 3);
        expected.put("ccc", 3);
        expected.put("ddd", 3);
        expected.put("eee", 3);
        Assertions.assertEquals(expected, res);
        Assertions.assertEquals(5, res.size());
    }

    @Test
    public void testWithRepeats() {
        HashMap<String, Integer> res = Task2.countHashtags(
            List.of("#aaa#aaa#bbb#ccc#ddd#fff#eee",
                "#aaa#bbb#ccc#bbb#ddd#eee#eee",
                "#aaa#ddd#bbb#ccc#ddd",
                "#aaa#ccc#bbb#ccc",
                "#aaa#bbb#bbb",
                "#aaa",
                "#ggg",
                "#hhh"
            ));
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("aaa", 6);
        expected.put("bbb", 5);
        expected.put("ccc", 4);
        expected.put("ddd", 3);
        expected.put("eee", 2);
        Assertions.assertEquals(expected, res);
        Assertions.assertEquals(5, res.size());
    }
}
