import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row=s.nextInt();
        System.out.print("Enter no. of columns: ");
        int col=s.nextInt();
        int mat[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]=s.nextInt();
                if(i>j){
                    System.out.println(mat[i][j]);
                }
                if(i==j){
                   System.out.println(mat[i][j]); 
                }
                if(i<j){
                    System.out.println(mat[i][j]);
                }
            }
        }
      
        
    }
}
