import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack <Integer> st=new Stack <>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.search(20));
        System.out.println(st.peek());
        System.out.println(st.empty());
        Iterator <Integer> itr= st.iterator();
        while(itr.hasNext())
        System.out.println(itr.next());
    }
}
