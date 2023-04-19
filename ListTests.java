import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    // List tests
    @Test
    public void testFilter() {
        List<String> list1 = new ArrayList<String>();
        StringChecker sc = new StringChecker();
        ListExamples.filter(list1, new StringChecker());
    }

    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("g");
        list1.add("q");

        List<String> list2 = new ArrayList<String>();
        list2.add("b");
        list2.add("z");

        assertArrayEquals(new String[]{"a", "b", "g", "q", "z"}, ListExamples.merge(list1, list2).toArray());
    }

}
