package jc.util;

public interface List<AnyType> extends Collection<AnyType> {
	AnyType get( int idx );
	AnyType set( int idx, AnyType value );

	ListIterator<AnyType> listIterator( int pos );
}
