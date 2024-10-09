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
public class ImovelTest {
    
    public ImovelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getEndereco method, of class Imovel.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Imovel instance = null;
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Imovel.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Imovel instance = null;
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Imovel.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Imovel instance = null;
        int expResult = 0;
        int result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Imovel.
     */
    

    /**
     * Test of getFinalidade method, of class Imovel.
     */
    @Test
    public void testGetFinalidade() {
        System.out.println("getFinalidade");
        Imovel instance = null;
        Finalidade expResult = null;
        Finalidade result = instance.getFinalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinalidade method, of class Imovel.
     */
    @Test
    public void testSetFinalidade() {
        System.out.println("setFinalidade");
        Finalidade finalidade = null;
        Imovel instance = null;
        instance.setFinalidade(finalidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Imovel.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Imovel instance = null;
        Bairro expResult = null;
        Bairro result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Imovel.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        Bairro bairro = null;
        Imovel instance = null;
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIptu method, of class Imovel.
     */
    @Test
    public void testCalcularIptu() {
        System.out.println("calcularIptu");
        Imovel instance = null;
        double expResult = 0.0;
        double result = instance.calcularIptu();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
