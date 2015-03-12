package JavaStructures.util;

public interface Queue<AnyType> extends Collection<AnyType>{
	AnyType element();
	
	AnyType remove();
}
