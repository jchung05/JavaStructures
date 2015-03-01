package JavaStructures.util;

public interface ListIterator<AnyType> extends Iterator<AnyType>{
	boolean hasPrevious();
	
	AnyType previous();

	void remove();
}
