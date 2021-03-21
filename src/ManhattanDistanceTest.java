import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ManhattanDistanceTest {

    @Test
    @DisplayName("Works when (x1, y1) is to the left of and below (x2, y2)")
    public void leftAndBelow() {
        assertEquals(ManhattanDistance.findManhattanDistance(1, 2, 3, 4),
                4);
    }

    @Test
    @DisplayName("Works when (x1, y1) is to the right of and below (x2, y2)")
    public void rightAndBelow() {
        assertEquals(ManhattanDistance.findManhattanDistance(5, 2, 3, 4),
                4);
    }

    @Test
    @DisplayName("Works when (x1, y1) is to the left of and above (x2, y2)")
    public void leftAndAbove() {
        assertEquals(ManhattanDistance.findManhattanDistance(1, 6, 3, 4),
                4);
    }

    @Test
    @DisplayName("Works when (x1, y1) is to the right of and above (x2, y2)")
    public void rightAndAbove() {
        assertEquals(ManhattanDistance.findManhattanDistance(5, 6, 3, 4),
                4);
    }

    @Test
    @DisplayName("Works when the points contain negative integers")
    public void negativeInts() {
        assertEquals(ManhattanDistance.findManhattanDistance(-1, 2, 1, -2),
                6);
    }
}