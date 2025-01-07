import java.util.*;

public class StockSpan {
    public static void calspan(int stocks[],int span[]){
        java.util.Stack<Integer> s = new java.util.Stack<>();
        span[0]=1;
        s.push(0);

        for (int i = 1;i<stocks.length;i++){
            int currPrice= stocks[i];
           while(!s.isEmpty() &&  currPrice > stocks[s.peek()]){
             s.pop();
           }
           if(s.isEmpty()){
            span[i]= i+1;
            
           }
           else {
            int prevHigh = s.peek();
            span[i] = i - prevHigh;
           }
           s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = { 10, 4, 5, 90, 120};
        int span [] = new int[stocks.length];
        calspan(stocks, span);

        for (int i = 0;i<span.length;i++){
            System.out.println("span for stock " + stocks[i] + " is " + span[i]);
        }

    }
}
