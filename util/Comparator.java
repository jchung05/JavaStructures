package JavaStructures.util;

public interface Comparator<AnyType>{
	int compare( AnyType lhs, AnyType rhs ) throws ClassCastException;
}
