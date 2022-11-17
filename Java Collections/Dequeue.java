import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque <String> dq=new ArrayDeque <> ();
        dq.add("X");
        dq.add("Y");
        dq.add("A");
        dq.add("C");
        System.out.println(dq);
        System.out.println(dq.element());
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq.offerLast("V"));
        System.out.println(dq.offerFirst("K"));
        System.out.println(dq);
        Iterator <String> itr=dq.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
        
    }
}
