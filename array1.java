import java.util.*;
public class array1{
    public static void maxsumsubarray(int numbers[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length;i++){
            int start= i;
            for(int j = 0; i<numbers.length;j++){
                int end= j;
                cursum = 0;
                for(int k = start; k<=end;k++){
                    cursum += numbers[k];
            }
            System.out.println(cursum);
        }
        System.out.println(cursum);
        if(maxsum < cursum){
            maxsum = cursum;
        }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxsumsubarray(numbers);
    }
}

