import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubstract() throws Rational.Illegal{
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(20, x.denominator);
    }
    @Test
    public void testMultiply() throws Rational.Illegal{
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }
    @Test
    public void testEqual() throws Rational.Illegal{
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        x.equals(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
}
