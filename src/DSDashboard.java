
public class DSDashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList llist = new LinkedList();

		for (int i = 0; i <= 20; i = i + 3) {
			llist.addNode(i);
		}
		llist.printList();

		for (int i = 0; i < llist.getSize(); i++) {
			if (i % 2 == 0) {
				llist.deleteNode();
			}
		}
		llist.printList();
	}
}
