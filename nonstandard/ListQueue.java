package JavaStructures.nonstandard;

public class ListQueue<AnyType>{
	public ListQueue(){
		front = back = null;
	}

	public boolean isEmpty(){
		return front == null;
	}

	public void makeEmpty(){
		front = back = null;
	}

	public AnyType getFront(){
		if( isEmpty() ) throw new RuntimeException( "Cannot getFront" );
		return front.element;
	}

	public void enqueue( AnyType x ){
		if( front == null && back == null ) front = back = new ListNode<AnyType>( x );
		else back = back.next = new ListNode<AnyType>( x );
	}

	public AnyType dequeue(){
		if( isEmpty() ) throw new RuntimeException( "Cannot dequeue" );
		AnyType x = front.element;
		front = front.next;
		return x;
	}

	private ListNode<AnyType> back;
	private ListNode<AnyType> front;
}

class ListNode<AnyType>{
	public ListNode( AnyType x ){
		this( x, null );
	}

	public ListNode( AnyType x, ListNode ln ){
		element = x;
		next = ln;
	}

	AnyType element;
	ListNode next;
}
