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

	}

	public void pop(){

	}

	public AnyType top(){
	
	}

	public AnyType topAndPop(){

	}

	private doubleArray(){
	
	}

	private AnyType[] arr;
	private int topOfStack;
}

