package JavaStructures.util;

public interface Iterator<AnyType>{
	boolean hasNext();
	
	AnyType next();

	void remove();
}
