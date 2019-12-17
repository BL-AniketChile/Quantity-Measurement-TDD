import com.bridgelabz.Inch;
import org.junit.Assert;
import org.junit.Test;

public class InchTest {

    @Test
    public void whenGivenTwoSameValueObjects_shouldReturnTrue() {
        Inch inch = new Inch(0.0);
        Assert.assertEquals(inch,new Inch(0.0));
    }
}
