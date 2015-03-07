package JavaStructures.nonstandard;

public interface Stack<AnyType>{
	void push( AnyType x );
	void pop();
	AnyType top();
	AnyType topAndPop();

	boolean isEmpty();
	void makeEmpty();
}
