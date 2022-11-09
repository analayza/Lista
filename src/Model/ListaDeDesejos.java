package Model;

import java.util.*;

import static java.util.Arrays.asList;

public class ListaDeDesejos<E>  extends AbstractList<E> implements List<E> {
    ArrayList<E> padaria = new ArrayList<E>();


    @Override
    public boolean add(E e) {
        return padaria.add(e);
    }

    @Override
    public E remove(int index) {
        return (E) padaria.remove(index);
    }

    @Override
    public E get(int index) {
        return (E) padaria.get(index);
    }

    @Override
    public int size() {
        return padaria.size();
    }

    @Override
    public String toString() {
        return "padaria=" + padaria;
    }
}
