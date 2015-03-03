package JavaStructures.util;

public interface Collection<AnyType> extends Iterable<AnyType>, java.io.Serializable{
	int size();
	
	boolean isEmpty();
	
	boolean add( AnyType x );
	
	boolean contains( Object x );
	
	boolean remove ( Object x );
	
	void clear ();
	
	Iterator<AnyType> iterator();

	Object [] toArray();
	
	<OtherType> OtherType [] toArray( OtherType [] arr );
}
