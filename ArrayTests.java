import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2}, input1);
	}

  @Test
  public void testReverseInPlace3() {
    int[] input1 = {1, 4, 7, 9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9, 7, 4, 1}, input1);
	}

  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {2, 2, 2};
    assertArrayEquals(new int[]{2, 2, 2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = {5};
    assertArrayEquals(new int[]{5}, ArrayExamples.reversed(input1));
  }
  
}



