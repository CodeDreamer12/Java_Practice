import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++){
		    a[i]=s.nextInt();
		    sum=sum+a[i];
		}
		System.out.println(sum);
		//For displaying elements of array
		for(int i:a){
		    System.out.println(i);
		}
	}
}
