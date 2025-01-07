import java.util.Scanner;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of items: ");

         double a = sc.nextFloat();
         double b = sc.nextFloat();
         double c = sc.nextFloat();


        double total = (a + b + c) ;
        double tax = total * 0.18;
        double totalBill = total + tax;

        System.out.println("the bill ammount is: " +totalBill);

    }
    
}
