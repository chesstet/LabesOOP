package Lab7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import Lab6.Automobile;

public class Leest implements List<Automobile> {
    private Node head;
    private Node tail;
    private int size;

    public Leest() {}

    public Leest(Automobile automobile) {

        add(automobile);
    }

    public Leest(Collection<? extends Automobile> collection) {

        addAll(collection);
    }

    @Override
    public boolean add(Automobile auto) {
        Node node = new Node(auto, null, tail);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public void add(int arg0, Automobile arg1) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean addAll(Collection<? extends Automobile> arg0) {
        boolean isCollectionChanged = false;
        for (Automobile auto : arg0) {
            isCollectionChanged |= add(auto);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends Automobile> arg1) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public boolean contains(Object arg0) {
        for (Automobile auto : this) {
            if (auto.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {
        for (Object auto : arg0) {
            if (!(auto.equals(arg0))) {
                return false;
            }
        }
        return true;

    }

    @Override
    public Automobile get(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public Iterator<Automobile> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Automobile> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Automobile next() {
            try {
                Automobile auto = currentNode.getAutomobile();
                currentNode = currentNode.getNext();
                return auto;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public int lastIndexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ListIterator<Automobile> listIterator() {

        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Automobile> {


        @Override
        public void add(Automobile arg0) {
            // TODO Auto-generated method stub

        }


        @Override
        public boolean hasPrevious() {

            return currentNode.getPrevious() != null;
        }


        @Override
        public int nextIndex() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Automobile previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getAutomobile();
        }

        @Override
        public int previousIndex() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

        @Override
        public void set(Automobile arg0) {
            // TODO Auto-generated method stub

        }
    }

    @Override
    public ListIterator<Automobile> listIterator(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Automobile remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Automobile set(int arg0, Automobile arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<Automobile> subList(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        // TODO Auto-generated method stub
        return null;
    }

}
