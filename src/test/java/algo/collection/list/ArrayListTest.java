package algo.collection.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private List<Integer> list;

    @Before
    public void beforeTest() {
        list = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
    }

    @Test
    public void testAddingToList() {
        List<Integer> list = new ArrayList<>(5);
        int n = 100;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        assertEquals(n, list.size());
    }

    @Test
    public void testRemovingFromList() {
        List<Integer> list = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        assertEquals(n, list.size());

        list.remove(5);
        assertEquals(n-1, list.size());
        assertEquals(6, (int)list.get(5));

        list.remove(0);
        assertEquals(1, (int)list.get(0));
        assertEquals(n-2, list.size());

        list.remove(7);
        assertEquals(8, (int)list.get(list.size()-1));
        assertEquals(n-3, list.size());
    }

    @Test
    public void testInsertingIntoList() {
        list.insert(5, 20);
        assertEquals(11, list.size());
        assertEquals(20, (int)list.get(5));
    }

    @Test
    public void testPuttingToList() {
        assertEquals(5, (int)list.get(5));
        list.put(5, 20);
        assertEquals(20, (int)list.get(5));
        assertEquals(10, list.size());
    }

}