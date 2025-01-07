public class largeststring{
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry"};
        String largest = strArray[0];
        for (int i = 1; i < strArray.length; i++) {
        if (strArray[i].length() > largest.length()) {
        largest = strArray[i];
        }
        }
        System.out.println("The largest string is " + largest);
    }
}