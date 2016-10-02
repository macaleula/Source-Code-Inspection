package br.calebe.ticketmachine.core;


import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrocoIteratorTest {
    
    @Test
    public void testaTrocoIterator() {
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
    @Test
    
    public void testaHasNext() {
        Troco troco = new Troco(2);

        Iterator<PapelMoeda> papeisMoeda = troco.getIterator();
        assertTrue(papeisMoeda.hasNext());
        papeisMoeda.next();
        assertFalse(papeisMoeda.hasNext());
    }
    
    @Test
    public void testaNext() {
        Troco troco = new Troco(7);
        Iterator<PapelMoeda> papeisMoeda = troco.getIterator();
        PapelMoeda aux = papeisMoeda.next();
        assertEquals(aux.getValor(),5);
        assertEquals(aux.getQuantidade(),1);
        
        aux = papeisMoeda.next();
        
        assertEquals(aux.getValor(),2);
        assertEquals(aux.getQuantidade(),1);
    }
    
    @Test
    public void remove() {
        Troco troco = new Troco(7);
        Iterator<PapelMoeda> papeisMoeda = troco.getIterator();

        assertTrue(papeisMoeda.hasNext());
        
        papeisMoeda.remove();       
        assertTrue(papeisMoeda.hasNext());
        
        papeisMoeda.remove();
        assertFalse(papeisMoeda.hasNext());       
    }   
}
