package JavaStructures.nonstandard;

public class ListStack<AnyType> implements Stack<AnyType>{
	public boolean isEmpty(){
		return stackEnd == null;
	}

	public void makeEmpty(){
		stackEnd = null;
	}

	public void push( AnyType x ){
		stackEnd = new ListNode( x, stackEnd );
	}

	public void pop(){
		if( isEmpty() ) throw new RuntimeException( "Cannot pop" );
		stackEnd = stackEnd.next;
	}

	public AnyType top(){
		if( isEmpty() ) throw new RuntimeException( "Cannot top" );
		return stackEnd.element;
	}

	public AnyType topAndPop(){
		if( isEmpty() ) throw new RuntimeException( "Cannot topAndPop" );
		AnyType x = stackEnd.element;
		stackEnd = stackEnd.next;
		return x;
	}

	private ListNode<AnyType> stackEnd = null;
}

class ListNode<AnyType>{
	public ListNode( AnyType x ){
		this( x, null );
	}

	public ListNode( AnyType x, ListNode<AnyType> ln ){
		element = x;
		next = ln;
	}

	AnyType element;
	ListNode next;
}
