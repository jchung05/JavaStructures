package JavaStructures.nonstandard;

public class ListQueue<AnyType>{
	public ListQueue(){
		queueFirst = queueLast = null;
	}

	public boolean isEmpty(){
		return queueFirst == null;
	}

	public void makeEmpty(){
		queueFirst = queueLast = null;
	}

	public AnyType getFront(){
		if( isEmpty() ) throw new RuntimeException( "Cannot getFront" );
		return queueFirst.element;
	}

	public void enqueue( AnyType x ){
		
	}

	public AnyType dequeue(){

	}

	private ListNode<AnyType> queueLast;
	private ListNode<AnyType> queueFirst;
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
