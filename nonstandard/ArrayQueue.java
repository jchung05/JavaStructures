

public class ArrayQueue<AnyType>{
	public ArrayQueue(){
		arr = (AnyType[]) new Object[10];
		makeEmpty();
	}

	public boolean isEmpty(){
		return currentSize == 0;
	}

	public void makeEmpty(){
		currentSize = front = 0;
		back = -1;
	}

	public AnyType getFront(){
		if( isEmpty() ) throw new RuntimeException( "Cannot getFront" );
		return arr[front];
	}

	public void enqueue( AnyType x ){
		if( currentSize == arr.length ) doubleQueue();
		back = increment( back );
		arr[back] = x;
		currentSize++;
	}

	public AnyType dequeue(){
		if( isEmpty() ) throw new RuntimeException( "Cannot dequeue" );
		currentSize--;
		AnyType val = arr[front];
		front = increment( front );
		return val;
	}


	private int increment( int x ){
		if( ++x == arr.length ) x = 0;
		return x;
	}

	private void doubleQueue(){
		AnyType[] newarr = (AnyType[]) new Object[2 * arr.length];
		for( int i = front; i < currentSize; i++, front = increment( front ) ){
			newarr[i] = arr[front];
		}
		arr = newarr;
		front = 0;
		back = currentSize - 1;
	}

	private AnyType[] arr;
	private int front;
	private int back;	
	private int currentSize;
}
