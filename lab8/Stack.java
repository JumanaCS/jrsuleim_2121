public class Stack<T> {
	java.util.ArrayList<T> list;

	/** You might want to use arraylist for this too */
	public Stack() {
		list = new java.util.ArrayList<>();
	}

	/**
	 * Returns the number of components in this stack.
	 *
	 * @return the number of components in the stack
	 */
	public int getSize() {
		int size = list.size();
		return size;
	}

	/**
	 * Tests if this stack is empty.
	 *
	 * @return true if the stack is empty false otherwise
	 */
	public boolean isEmpty() {
		if(getSize() == 0)
			return true;
		else
			return false;
	}

	/**
	 * Pushes an item onto the top of this stack.
	 */
	public void push(T item) {
		try {
			list.add(item); 
		}
		catch(Exception e) {
			System.out.println("Cannot insert element.");
		}
	}

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 *
	 * @return the object at the top of this stack
	 */
	public T peek() {
		if(isEmpty() == false) {
			int i=getSize()-1; 
			T element = list.get(i);  
			return element; 
		}
		else
			return null;
	}

	/**
	 * Removes the object at the top of this stack and returns that object as the
	 * value of this function.
	 *
	 * @return The object at the top of this stack
	 */
	public T pop() {
		if(isEmpty()==false) {
			int i=getSize()-1;       
			T element = list.get(i); 
			list.remove(i);
			return element;  
		}
		else
			return null;
	}

	/**
	 * Prints each component of the stack seperated by a new line character.
	 *
	 * @returns The string representation of the stack
	 */
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < getSize();i++) 
			str= str+list.get(i)+System.lineSeparator();
		return str;
	}

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		stack.pop();
		stack.pop();
		System.out.println(stack.toString());

		stack.push("still");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());

		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
}
