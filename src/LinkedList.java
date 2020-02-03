
public class LinkedList {

	Node head;

	public void addNode(int data) {
		if (head == null) {
			head = newNode(data);
			return;
		}
		Node temp = newNode(data);
		temp.next = head;
		head = temp;
	}

	public int deleteNode() {
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public boolean isEmpty() {
		return (head == null) ? true : false;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int getSize() {
		int count = 0;

		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public Node newNode(int data) {
		Node temp = new Node(data);
		return temp;
	}

	private class Node {
		int data;
		Node next;

		@SuppressWarnings("unused")
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}
