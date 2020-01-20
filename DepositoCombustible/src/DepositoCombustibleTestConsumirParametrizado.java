import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestConsumirParametrizado
{
    private final double max = 40.0;
    private double current, consume, left;

    public DepositoCombustibleTestConsumirParametrizado (double current, double consume, double left)
    {
        this.current = current;
        this.consume = consume;
        this.left = left;
    }

    @Parameters
    public static Collection<Object[]> params()
    {
        return Arrays.asList(new Object[][]
        {
            { 40.0, 40.0, 0.0 }, { 30.0, 20.0, 10.0 }, { 40.0, 5.0, 35.0 }, { 0.0, 0.0, 0.0 }, { 10.0, -30.0, 40.0 }
        });
    }

    @Test
    public void testConsumir()
    {
        DepositoCombustible tank = new DepositoCombustible(max, current);
        tank.consumir(consume);
        assertEquals(left, tank.getDepositoNivel(), 0);
    }
}
