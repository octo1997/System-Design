package designPattern.iterator;

public interface Iterator<T> {
	public T next();
	public T getCurrentItem();
	public boolean hasNext();
}
