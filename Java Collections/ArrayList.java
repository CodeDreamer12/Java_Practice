import java.util.*;
public class Main
{
	public static void main(String[] args) {
	ArrayList <Integer> alist=new ArrayList<Integer>();
		alist.add(20);
		alist.add(12);
		alist.add(36);
		alist.add(8);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);
		System.out.println(alist.size());
		Iterator <Integer> itr=alist.iterator();
		while(itr.hasNext())
		    System.out.println(itr.next());
		
	}
}
