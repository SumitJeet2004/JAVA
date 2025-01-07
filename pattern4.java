import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        int  n = 4;
        int count = 1;

        for(int row = 1;row <=n;row++){
            for(int col = 1;col <=n;col++){
                if( row >= col ){ 
                    System.out.print(count);
                    count++;
                }
                else {
                    System.out.print( " ");
                }
        }
            System.out.println();
       }
    }
}