public class permutation {
    public static void findpermutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
            }

        //recursion
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+ch);
    } 
}
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findpermutation(str,ans);
        }

    

}
