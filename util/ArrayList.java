package JavaStructures.util;
import java.io.*;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrayList<AnyType> extends AbstractCollection<AnyType> implements List<AnyType>{
	public ArrayList(){ clear();}

	public ArrayList( Collection<? extends AnyType> oarr ){
		clear();
		for( AnyType x : oarr ) add( x );
	}

	public AnyType get( int idx ){
		if( idx < 0 || idx >= size() ) throw new ArrayIndexOutOfBoundsException();	
		return arr[idx];
	}

	public AnyType set( int idx, AnyType value ){
		if( idx < 0 || idx >= size() ) throw new ArrayIndexOutOfBoundsException();
		AnyType oldval = arr[idx];
		arr[idx] = value;
		return oldval;
	}

	public int size(){ return theSize;}

	public void clear(){
		theSize = 0;
		arr = ( AnyType [] ) new Object[10];
		modCount++;
	}

	public boolean add( AnyType x ){
		if( size() == arr.length ){
			AnyType [] temp = arr;
			arr = ( AnyType [] ) new Object[ arr.length * 2 ];
			for( int i = 0; i < size(); i++ ){
				arr[i] = temp[i];
			}
		}
		arr[ theSize++ ] = x;
		modCount++;
		return true;
	}

	public boolean remove( Object x ){
		if( findPos( x ) == -1 ) return false;
		else{
			remove( findPos( x ) );
			return true;
		}
	}
	
	public AnyType remove( int idx ){
		AnyType oldItem = arr[idx];
		for( int i = idx; i < size() - 1; i++ ){
			//The last item is ignored and masked out
			arr[i] = arr[i+1];
		}
		theSize--;
		modCount++;
		return oldItem;
	}

	public boolean contains( Object x ){
		return findPos( x ) != -1;
	}

	public int findPos( Object x ){
		for( int i = 0; i < size(); i++ ){
			if( x == null && arr[i] == null ) return -1;
			if( x.equals( arr[i] ) ) return i;
		}
		return -1;
	}

	public Iterator<AnyType> iterator(){
		return new ArrayListIterator( 0 );
	}

	public ListIterator<AnyType> listIterator( int idx ){
		return new ArrayListIterator( idx );
	}

	private class ArrayListIterator implements ListIterator{
		private int current;
		private int expectedModCount = modCount;
		private boolean nextCompleted = false;
		private boolean previousCompleted = false;

		ArrayListIterator( int x ){
			if( x < 0 || x > size() ) throw new IndexOutOfBoundsException();
		}

		public boolean hasNext(){
			if( expectedModCount != modCount ) throw new ConcurrentModificationException();
			return current < size();
		}

		public boolean hasPrevious(){
			if( expectedModCount != modCount ) throw new ConcurrentModificationException();
			return current > 0;
		}

		public AnyType next(){
			if( hasNext() ){
				nextCompleted = true;
				previousCompleted = false;
				return arr[current++];
			}
			throw new NoSuchElementException();
		}

		public AnyType previous(){
			if( hasPrevious() ){
				nextCompleted = false;
				previousCompleted = true;
				return arr[--current];
			}
			throw new NoSuchElementException();
		}

		public void remove(){
			if( expectedModCount != modCount ) throw new ConcurrentModificationException();
			
			if( nextCompleted ) ArrayList.this.remove( --current );
			else if( previousCompleted ) ArrayList.this.remove( current );
			else throw new IllegalStateException();

			previousCompleted = nextCompleted = false;
			expectedModCount++;
		}
	}
	
	private AnyType [] arr;
	private int theSize;
	private int modCount = 0;
}
