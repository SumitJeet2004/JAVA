import java.util.*;

public class bubblesort{
    public static void bubblesorting(int arr[]){
        for ( int turn=0;turn<arr.length;turn++){
            for (int i=0;i<arr.length-turn-1;i++){
                if (arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        
    }

    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            
        }
        
    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,90};
        bubblesorting(arr);
        printarray(arr);
    }
}