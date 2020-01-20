import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest
{
    private DepositoCombustible tank;
    private final double max = 40.0;

    @Before
    public void before()
    {
        tank = new DepositoCombustible(max, 0.0);
    }

    @Test
    public void testDepositoCombustible()
    {
        assertNotNull(tank);
    }

    @Test
    public void testGetDepositoNivel()
    {
        assertEquals(0.0 , tank.getDepositoNivel(), 0);
    }

    @Test
    public void testGetDepositoMax()
    {
        assertEquals(40.0 , tank.getDepositoMax(), 0);
    }

    @Test
    public void testEstaVacio()
    {
        assertTrue(tank.estaVacio());
    }

    @Test
    public void testEstaLleno()
    {
        tank.fill(tank.getDepositoMax() / 2);
        assertTrue(tank.estaLleno());
    }
}
