import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 4, 5, 7 };
        assertArrayEquals(a1, a2, "Arrays are not equal");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };
        assertArrayEquals(a11, a12, "2D Arrays are not equal");
    }

    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "hello", "world" };
        String[] s2 = { "hello", "world" };
        assertArrayEquals(s1, s2, "String arrays should be equal");
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, "Double arrays should be equal");
    }
}
