package jc.util;

public interface Collection<AnyType> extends Iterable<AnyType>, java.io.Serializable{
	int size();
	boolean isEmpty();
	boolean add( AnyType x );
	boolean contains( Object x );
	boolean remove ( Object x );
	void clear ();
	Object [] toArray();
	<OtherType> OtherType [] toArray( OtherType [] arr );
	java.util.Iterator<AnyType> iterator();
}
