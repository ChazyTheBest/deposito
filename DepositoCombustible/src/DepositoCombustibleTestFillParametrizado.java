import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestFillParametrizado
{
    private final double max = 40.0;
    private double current, fill, left;

    public DepositoCombustibleTestFillParametrizado (double current, double fill, double left)
    {
        this.current = current;
        this.fill = fill;
        this.left = left;
    }

    @Parameters
    public static Collection<Object[]> params()
    {
        return Arrays.asList(new Object[][] {
            { 40.0, 0.0, 40.0 }, { 0.0, 40.0, 40.0 }, { 35.0, 5.0, 40.0 }, { 0.0, 0.0, 0.0 }, { 10.0, -30.0, -20.0 }
        });
    }

    @Test
    public void testFill()
    {
        DepositoCombustible tank = new DepositoCombustible(max, current);
        tank.fill(fill);
        assertEquals(left, tank.getDepositoNivel(), 0);
    }
}
