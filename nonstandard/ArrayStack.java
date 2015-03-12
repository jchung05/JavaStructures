package JavaStructures.nonstandard;

public class ArrayStack<AnyType> implements Stack<AnyType>{
	public ArrayStack(){
		arr = ( AnyType [] ) new Object[ 10 ];
		topOfStack = -1;
	}

	public boolean isEmpty(){
		return topOfStack == -1;
	}

	public void makeEmpty(){
		topOfStack = -1;
	}

	public void push( AnyType x ){
		if( ( topOfStack + 1 ) == arr.length ){
			doubleArray();
		}
		arr[++topOfStack] = x;
	}

	public void pop(){
		if( isEmpty() ) throw new RuntimeException( "Cannot pop" );
		topOfStack--;
	}

	public AnyType top(){
		if( isEmpty() ) throw new RuntimeException( "Cannot top" );
		return arr[topOfStack];	
	}

	public AnyType topAndPop(){
		if( isEmpty() ) throw new RuntimeException( "Cannot topnpop" );
		return arr[topOfStack--];
	}

	private void doubleArray(){
		AnyType[] newarr = (AnyType[]) new Object[2 * arr.length];
		for( int i = 0; i < arr.length; i++ ){
			newarr[i] = arr[i];
		}
		arr = newarr;
	}

	private AnyType[] arr;
	private int topOfStack;
}

