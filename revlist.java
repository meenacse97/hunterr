package guvi;
import java.util.*;
public class revlist {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("The list elements are :");
		ListIterator<Integer> it = a.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("The reverse order of list is : ");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		}

}
