import java.util.*;
public class Main{
    public static void main(String[] args){
        PriorityQueue <String> pq=new PriorityQueue <>();
        pq.add("X");
        pq.add("Y");
        pq.add("A");
        pq.add("C");
        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        Iterator <String> itr=pq.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
    }
}
