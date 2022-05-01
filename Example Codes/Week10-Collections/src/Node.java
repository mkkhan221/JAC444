
public class Node<E> {
	E element;
	Node<E> next;
	public Node(E e) {
		// TODO Auto-generated constructor stub
		this.element=e;
		
	}
	public Node<E> getNext(){
		return this.next;
	}
	public E getElement(){
		return this.element;
	}
}
