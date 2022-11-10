import java.util.ArrayList;
import java.util.HashMap;
import org.example.task2.Task2;
import org.example.task3.Cube;
import org.example.task3.Cylinder;
import org.example.task3.Figure;
import org.example.task3.Sphere;
import org.example.task3.Task3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task3Test {

    private static ArrayList<Figure> setupExpectedFigures(){
        ArrayList<Figure> expected = new ArrayList<>();
        expected.add(new Sphere((double) 0));
        expected.add(new Cube((double) 1));
        expected.add(new Cube((double) 5));
        expected.add(new Sphere((double) 4));
        expected.add(new Cylinder((double) 3, (double) 9));
        return expected;
    }

    @Test
    public void testIsNull(){
        assertThrows(IllegalArgumentException.class, () -> Task3.sort(null));
    }

    @Test
    public void testIsEmpty() {
        ArrayList<Figure> input = new ArrayList<>();
        Task3.sort(input);
        assertEquals(new ArrayList<>(), input);
        assertEquals(0, input.size());
    }

    @Test
    public void testAllCubesSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            input.add(new Cube((double) i));
            expected.add(new Cube((double) i));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllCubesNotSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 4; i >= 0; i--) {
            input.add(new Cube((double) i));
        }
        for (int i = 0; i < 5; i++) {
            expected.add(new Cube((double) i));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllCylinderSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            input.add(new Cylinder((double) i, (double) (i*i)));
            expected.add(new Cylinder((double) i, (double) (i*i)));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllCylinderNotSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 4; i >= 0; i--) {
            input.add(new Cylinder((double) i, (double) (i*i)));
        }
        for (int i = 0; i < 5; i++) {
            expected.add(new Cylinder((double) i, (double) (i*i)));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllSphereSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            input.add(new Sphere((double) i));
            expected.add(new Sphere((double) i));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllSphereNotSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = new ArrayList<>();
        for (int i = 4; i >= 0; i--) {
            input.add(new Sphere((double) i));
        }
        for (int i = 0; i < 5; i++) {
            expected.add(new Sphere((double) i));
        }
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllFiguresSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = setupExpectedFigures();
        input.add(new Sphere((double) 0));
        input.add(new Cube((double) 1));
        input.add(new Cube((double) 5));
        input.add(new Sphere((double) 4));
        input.add(new Cylinder((double) 3, (double) 9));
        
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }

    @Test
    public void testAllFiguresNotSorted() {
        ArrayList<Figure> input = new ArrayList<>();
        ArrayList<Figure> expected = setupExpectedFigures();
        input.add(new Sphere((double) 0));
        input.add(new Cube((double) 1));
        input.add(new Cylinder((double) 3, (double) 9));
        input.add(new Sphere((double) 4));
        input.add(new Cube((double) 5));
        
        Task3.sort(input);
        assertEquals(expected, input);
        assertEquals(expected.size(), input.size());
    }
}
