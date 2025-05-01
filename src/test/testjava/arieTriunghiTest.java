package testjava;

import mainjava.arieTriunghi;
import org.junit.Test;
import static org.junit.Assert.*;

public class arieTriunghiTest {
    private static final double DELTA = 0.001;

    // Teste pentru input invalid
    @Test(expected = IllegalArgumentException.class)
    public void testLaturaANegativa() {
        arieTriunghi.calculArie(-1, 2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLaturaBNegativa() {
        arieTriunghi.calculArie(1, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLaturaCNegativa() {
        arieTriunghi.calculArie(1, 2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLaturaAZero() {
        arieTriunghi.calculArie(0, 2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNuFormeazaTriunghi() {
        arieTriunghi.calculArie(1, 1, 3);
    }

    // Teste pentru calcul corect
    @Test
    public void testTriunghiDreptunghic() {
        assertEquals(6.0, arieTriunghi.calculArie(3, 4, 5), DELTA);
    }

    @Test
    public void testTriunghiEchilateral() {
        assertEquals(1.732, arieTriunghi.calculArie(2, 2, 2), DELTA);
    }

    @Test
    public void testTriunghiOarecare() {
        assertEquals(6.495, arieTriunghi.calculArie(3, 5, 7), DELTA);
    }
}