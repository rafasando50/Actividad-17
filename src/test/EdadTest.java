package test;

import model.Edad;
import org.junit.Test;
import static org.junit.Assert.*;

public class EdadTest {
    @Test
    public void caso1() {
        assertEquals(24, Edad.calcularEdad(2000, 5, 15));
    }

    @Test
    public void caso2() {
        assertEquals(43, Edad.calcularEdad(1980, 11, 30));
    }

    @Test
    public void caso3() {
        assertEquals(IllegalArgumentException.class, Edad.calcularEdad(2025, 1, 1));
    }

    @Test
    public void caso4() {
        assertEquals(IllegalArgumentException.class, Edad.calcularEdad(1990, 13, 1));
    }

    @Test
    public void caso5() {
        assertEquals(IllegalArgumentException.class, Edad.calcularEdad(2000, 4, 31));
    }

    @Test
    public void caos6() {
        assertEquals(124, Edad.calcularEdad(1900, 2, 29));
    }

    @Test
    public void caso7() {
        assertEquals(20, Edad.calcularEdad(2004, 2, 29));
    }

    @Test
    public void caso8() {
        assertEquals(3, Edad.calcularEdad(2020, 10, 31));
    }

    @Test
    public void caso9() {
        assertEquals(0, Edad.calcularEdad(2023, 10, 16));
    }
    
    @Test
    public void caso10() {
        assertEquals(23, Edad.calcularEdad(2001, 9, 8));
    }
}
