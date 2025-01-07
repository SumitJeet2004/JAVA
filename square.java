import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter the side of a square : ");

        int a = sc.nextInt();
        int area = a * a;

        System.out.println("area of the square is: " + area);



    
}
}