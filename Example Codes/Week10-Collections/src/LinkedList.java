
public class LinkedList<E> {
	Node<E> head;
	Node<E> tail;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
		head=null;
		tail=null;
	}
	public void add(E element) {
		Node<E> a=new Node<E>(element);
		if (tail==null) {
			head=a;
			tail=head;
		}
		else {
			tail.next=a;
			tail=a;
		}
	}
}
