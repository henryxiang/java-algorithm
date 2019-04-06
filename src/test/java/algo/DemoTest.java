package algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DemoTest {
    @Test
    public void demoTest() {
        assertTrue(1 + 1 == 2);
    }

    @Test
    public void testList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Assert.assertEquals(2, list.size());
//        int i = list.get(0);
        Assert.assertEquals(1, (int)list.get(0));
    }
}
