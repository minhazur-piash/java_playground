package playground;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by minhazur on 6/26/16.
 */


public class MathUtilsTest extends TestCase {

    @Test
    public void testSumOfOneAndTwoIsThree() {
        int result = MathUtils.sum(1, 2);
        assertEquals(result, 3);
    }
}
