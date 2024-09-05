/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yvasouza
 */
public class PontoTest {
    
    public PontoTest() {
    }

    /**
     * Test of getX method, of class Ponto.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Ponto.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Ponto instance = new Ponto();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Ponto.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Ponto.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Ponto instance = new Ponto();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaIncidindoSobreX method, of class Ponto.
     */
    @Test
    public void testEstaIncidindoSobreX() {
        System.out.println("estaIncidindoSobreX");
        Ponto instance = new Ponto();
        Boolean expResult = null;
        Boolean result = instance.estaIncidindoSobreX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaIncidindoSobreY method, of class Ponto.
     */
    @Test
    public void testEstaIncidindoSobreY() {
        System.out.println("estaIncidindoSobreY");
        Ponto instance = new Ponto();
        Boolean expResult = null;
        Boolean result = instance.estaIncidindoSobreY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of identificarQuadrante method, of class Ponto.
     */
    @Test
    public void testIdentificarQuadrante() {
        System.out.println("identificarQuadrante");
        Ponto instance = new Ponto();
        Quadrante expResult = null;
        Quadrante result = instance.identificarQuadrante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class Ponto.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("calcularDistancia");
        Ponto outroPonto = null;
        Ponto instance = new Ponto();
        Double expResult = null;
        Double result = instance.calcularDistancia(outroPonto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistanciaEntreDoisPontos method, of class Ponto.
     */
    @Test
    public void testCalcularDistanciaEntreDoisPontos() {
        System.out.println("calcularDistanciaEntreDoisPontos");
        Ponto ponto1 = null;
        Ponto ponto2 = null;
        Ponto instance = new Ponto();
        Double expResult = null;
        Double result = instance.calcularDistanciaEntreDoisPontos(ponto1, ponto2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
