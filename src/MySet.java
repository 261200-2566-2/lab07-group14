//Helped by ChatGPT
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class MySet<E> implements Set<E> {
    private final HashMap<E, Boolean> map;

    public MySet() {
        this.map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.keySet().toArray();
    }

    @Override
    public boolean add(E e) {
        map.put(e, true);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        map.remove(o);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            map.put(element, true);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        map.keySet().retainAll(c);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        map.keySet().removeAll(c);
        return true;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean equals(Object o) {
        // Return "default value" for equals
        return false;
    }

    @Override
    public int hashCode() {
        // Return "default value" for hashCode
        return 0;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // Return "default value" for toArray
        return null;
    }
}
