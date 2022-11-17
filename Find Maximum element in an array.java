import java.util.*;
public class Main{
    static void maxEle(int x[]){
        int max;
        max=x[0];
        for(int i=0; i<x.length; i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int a[]={8,4,10,2,9};
        maxEle(a);
    }
}
