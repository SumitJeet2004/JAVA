import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        int  n = 5;

        for(int row = 1;row <=n;row++){
            for(int col = 1;col <=n;col++){
                if( row <=col ){  // if( row >=col ) for reverse
                    System.out.print("* ");
                }
                
        }
            System.out.println(" ");
       }
    }
}