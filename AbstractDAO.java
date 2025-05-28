import java.util.Vector;

public abstract class AbstractDAO<T> {
    public abstract void add(T item);
    public abstract void remove(T item);
    public abstract Vector<T> getAll();
}
