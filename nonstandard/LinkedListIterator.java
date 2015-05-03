package JavaStructures.nonstandard;

public class LinkedListIterator<AnyType>{
	public LinkedListIterator( ListNode<AnyType> node ){
		current = node;
	}

	public boolean isValid(){
		return current != null;
	}

	public void advance(){
		if( isValid() ) current = current.next;
	}

	public AnyType retrieve(){
		return isValid() ? current : null;
	}

	private ListNode<AnyType> current;
}
