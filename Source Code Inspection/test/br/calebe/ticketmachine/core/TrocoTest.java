package br.calebe.ticketmachine.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ECL-0186
 */
public class TrocoTest {
    
    public TrocoTest() {
    }
    @Test
    public void testaTroco() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Troco troco = new Troco(39);
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = {0, 0, 1, 1, 1, 2, 0};
        int i = 0;
        Field field = Troco.class.getDeclaredField("papeisMoeda");
        field.setAccessible(true);
        ArrayList<PapelMoeda> papeisMoeda = (ArrayList<PapelMoeda>) field.get(troco);
        
        for(PapelMoeda pm : papeisMoeda) {
            while(pm.getValor() != valoresNotas[i]) i++;
            assertEquals(pm.getValor(), valoresNotas[i]);
            assertEquals(pm.getQuantidade(), quantidadeNotas[i]);
            i++;
        }     
    }
    
    @Test
    public void testaCalculaTroco() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Troco troco = new Troco(37);
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = {0, 0, 1, 1, 1, 1, 0};
        int i = 0;
        Field field = Troco.class.getDeclaredField("papeisMoeda");
        field.setAccessible(true);
        ArrayList<PapelMoeda> papeisMoeda = (ArrayList<PapelMoeda>) field.get(troco);
        
        for(PapelMoeda pm : papeisMoeda) {
            while(pm.getValor() != valoresNotas[i]) i++;
            assertEquals(pm.getValor(), valoresNotas[i]);
            assertEquals(pm.getQuantidade(), quantidadeNotas[i]);
            i++;
        }     
    }
    
    @Test
    public void testaGetIterator() {
        Troco troco = new Troco(37);
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = {0, 0, 1, 1, 1, 1, 0};
        int i = 0;
        Iterator<PapelMoeda> papeisMoeda = troco.getIterator();
        PapelMoeda pm = null;

        while(papeisMoeda.hasNext()) {
            pm = papeisMoeda.next();
            while(valoresNotas[i] != pm.getValor()) i++;
            assertEquals(pm.getValor(), valoresNotas[i]);
            assertEquals(pm.getQuantidade(), quantidadeNotas[i]);
            i++;
        }     
    }
}    
 

