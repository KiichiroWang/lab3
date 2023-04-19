import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    //ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 1, 1, 1, 3, 5, 5, 5};
    input2 = ArrayExamples.reverseInPlace(input2);

    assertArrayEquals(new int[]{5, 5, 5, 3, 1, 1, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 1, 1, 1, 3, 5, 5, 5};
    int[] result = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{5, 5, 5, 3, 1, 1, 1}, result);
  }
}
