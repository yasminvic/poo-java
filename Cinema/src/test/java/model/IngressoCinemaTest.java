/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yvasouza
 */
public class IngressoCinemaTest {
    
    public IngressoCinemaTest() {
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     */
    @Test
    public void VerificaDescontoQuartaTeste() {
        IngressoCinema instance = new IngressoCinema(false, DiaSemana.QUARTA);
        float expResult = 7.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     */
    @Test
    public void VerificaDescontoQuartaQuandoEstudanteTeste() {
        IngressoCinema instance = new IngressoCinema(true, DiaSemana.QUARTA);
        float expResult = 7.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     */
    @Test
    public void VerificaDescontoSegundaQuandoEstudanteTeste() {
        IngressoCinema instance = new IngressoCinema(true, DiaSemana.SEGUNDA);
        float expResult = 10.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     */
    @Test
    public void VerificaDescontoSabadoQuandoEstudanteTeste() {
        IngressoCinema instance = new IngressoCinema(true, DiaSemana.SABADO);
        float expResult = 14.7F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     */
    @Test
    public void VerificaDescontoSabadoTeste() {
        IngressoCinema instance = new IngressoCinema(false, DiaSemana.SABADO);
        float expResult = 21.0F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
}
