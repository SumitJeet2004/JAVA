public class reversestack {
    public static String reverseString(String str){
        java.util.Stack<Character> s = new java.util.Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
            }
            StringBuilder result = new StringBuilder("");
            while(!s.isEmpty()){
                char  curr = s.pop();
                result.append(curr);

    }
    return result.toString();
}
 public static void main(String[] args) {
    String str = "abc";
    String reuslt = reverseString(str);
    System.out.println(reuslt);

    
 }
    
}
