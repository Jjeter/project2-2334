import org.junit.Assert;
import org.junit.Test;

public class Test
{
    final double DELTA = 0.001;
    
    @Test
    public void measurementTest()
    {
        Measurement good = new Measurement(0);
        Measurement bad = new Measurement(-999);
        Measurement empty = new Measurement();
        Assert.assertEquals("Retrieved incorrect value.", 0, good.getValue(), DELTA);
        Assert.assertEquals("Good case is invalid", true, good.isValid());
        Assert.assertEquals("Bad case is valid", false, bad.isValid());
        Assert.assertEquals("Bad toString for valid", "0.0000", good.toString());
        Assert.assertEquals("Bad toString for invalid", "bad", empty.toString());
    }
}
