import com.bridgelabz.Length;
import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET,0);
        Assert.assertEquals(feet,new Length(Length.Unit.FEET,0));
    }

    @Test
    public void whenGivenTwoDifferentFeetValueObject_shouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertNotEquals(feet,new Length(Length.Unit.FEET,1.0));
    }

    @Test
    public void whenGivenTwoSameInchValueObjects_shouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch,new Length(Length.Unit.INCH, 0.0));
    }

    @Test
    public void whenGivenTwoDifferentInchObjects_shouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(inch,new Length(Length.Unit.INCH, 1.0));
    }

    @Test
    public void whenGivenFeetAndInchObjects_shouldNotEquals() {
        Length feet = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet, new Length(Length.Unit.INCH,1.0));
    }
}
