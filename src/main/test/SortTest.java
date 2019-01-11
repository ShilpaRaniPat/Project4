import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortTest {
    Sort s = new Sort();

    @Before
    public void setUp() throws Exception {
        Sort s = new Sort();

    }

    @After
    public void tearDown() throws Exception {
        return;
    }

    @Test
    public void CheckSort() {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> actualvalue = s.sortWords("I have a sentence");
        words.add("I");
        words.add("a");
        words.add("have");
        words.add("sentence");
        ArrayList<String> expectedvalue = words;

    }
}