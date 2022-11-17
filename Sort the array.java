import java.util.*;
public class Main{
    static int[] sortEle(int x[]){
        for(int i=0; i<x.length-1; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i]>x[j]){
                int temp=x[i];
                x[i]=x[j];
                x[j]=temp;
                }
            }
        }
        return x;
    }
    public static void main(String[] args){
        int a[]={8,2,10,4,6};
        int f[]=sortEle(a);
        for(int i=0; i<f.length; i++){
            System.out.println(f[i]);
        }
    }
}
