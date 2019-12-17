import com.bridgelabz.Feet;
import com.bridgelabz.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
        Feet feet = new Feet(0);
        Assert.assertEquals(feet,new Feet(0));
    }

    @Test
    public void whenGivenTwoDifferentValueObject_shouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(feet,new Feet(1.0));
    }
}
