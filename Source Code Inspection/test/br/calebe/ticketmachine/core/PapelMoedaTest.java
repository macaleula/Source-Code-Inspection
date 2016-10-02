package br.calebe.ticketmachine.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ECL-0186
 */
public class PapelMoedaTest {
    
    @Test
    public void testaPapelMoeda() {
        PapelMoeda pm = new PapelMoeda(2,1);
        
        assertEquals(pm.getValor(), 2);
        assertEquals(pm.getQuantidade(), 1);
    }
    
    @Test
    public void testaGetValor() {
        PapelMoeda pm = new PapelMoeda(2,1);
        
        assertEquals(pm.getValor(), 2);
    }
    
    @Test
    public void testaSetValor() {
        PapelMoeda pm = new PapelMoeda(2,1);
        pm.setValor(5);
        assertEquals(pm.getValor(), 5);
    }
    @Test
    public void testaGetQuantidade() {
        PapelMoeda pm = new PapelMoeda(2,1);
        
        assertEquals(pm.getQuantidade(), 1);
    }
    @Test
    public void testaSetQuantidade() {
        PapelMoeda pm = new PapelMoeda(2,1);
        pm.setQuantidade(10);
        assertEquals(pm.getQuantidade(), 10);
    }
}
