/**
 * 
 */
package collections_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class ListStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Belfast");
		arrayList.add("Dublin");

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");

		// not quiteright ?
		
		swapElementsInLinkedList(linkedList, 1,3);
		swapElementsInLinkedList(linkedList, 1,2);
		for(String s : linkedList) {
			System.out.println(s);
		}

	}

	public static void showList(List<String> list) {
		for (String e : list) {
			System.out.println(e);
		}
	}

	public static void showCollection(Collection<String> collection) {
		for (String e : collection) {
			System.out.println(e);
		}
	}
	
	
	public static void swapElementsInLinkedList(List<String> ll, int index1, int index2) {
		
		String atIndex1 = ll.get(index1);
		
		ll.set(index1, ll.get(index2));
		ll.set(index2, atIndex1);
	}
	
	
	

}
