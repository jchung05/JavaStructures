package JavaStructures.util;

public abstract class AbstractCollection<AnyType> implements Collection<AnyType>{
	public boolean isEmpty(){ return size() == 0;}

	public void clear(){
		Iterator<AnyType> itr = iterator();
		while( itr.hasNext() ){
			itr.next();
			itr.remove();
		}
	}

	public boolean add( AnyType x ){
		throw new UnsupportedOperationException();
	}

	public boolean contains( Object x ){
		if( x == null ) return false;
		for( AnyType value : this ){
			if( x.equals( value ) ) return true;
		}
		return false;
	}

	//Can't use foreach loop on a modification to the collection or else exception
	public boolean remove( Object x ){
		if( x == null ) return false;
		Iterator<AnyType> itr = iterator();
		while( itr.hasNext() ){
			if( x.equals( itr.next() ) ){
				itr.remove();
				return true;
			}
		}
		return false;
	}

	public Object [] toArray(){
		Object [] oarr = new Object[ size() ];
		int i = 0;

		for( AnyType value : this ){
			oarr[i] = value;
			i++;
		}
		return oarr;
	}

	public <OtherType> OtherType [] toArray( OtherType [] arr ){
		throw new UnsupportedOperationException();
	}
}

