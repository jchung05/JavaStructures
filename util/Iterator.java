package JavaStructures.util;

public interface Iterator<AnyType> extends java.util.Iterator{
	boolean hasNext();
	
	AnyType next();

	void remove();
}
