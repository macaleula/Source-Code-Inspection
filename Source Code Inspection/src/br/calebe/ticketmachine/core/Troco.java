package br.calebe.ticketmachine.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    private ArrayList<PapelMoeda> papeisMoeda;

    public Troco(int valor) {
        this.papeisMoeda = calculaTroco(valor);
    }
    
    private static ArrayList<PapelMoeda> calculaTroco(int valor) {
        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1};
        ArrayList<PapelMoeda> notas = new ArrayList();
        int i, ct;
        i = 0;
        while (valor != 0) {
            ct = valor / valoresNotas[i];
            if (ct != 0) {
                notas.add(new PapelMoeda(valoresNotas[i],ct));
                valor = valor % valoresNotas[i];
            }
            i = i + 1;
        }      
        return notas;
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator();
    }

    class TrocoIterator implements Iterator<PapelMoeda> {
        private int index;

        public TrocoIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < papeisMoeda.size();
        }

        @Override
        public PapelMoeda next() {
            if(!hasNext()) throw new NoSuchElementException();
            return papeisMoeda.get(index++);
        }

        @Override
        public void remove() {
            papeisMoeda.remove(index);
        }
    }
}
