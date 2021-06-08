import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void testCountAnagram(){
        String str = new String("cars are very cool so are arcs and my os");
        int actual = Main.countAnagram(str);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testDeleteDuplicates(){
        String str = new String("word drow word word are you are");
        String[] actualArray = Main.deleteDuplicates(str);
        String[] expectedArray = {"word", "drow", "are", "you"};
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testAreAnagram(){
        boolean actual = Main.areAnagram("word", "drow");
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
