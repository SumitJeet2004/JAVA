public class subset {
    public static void findsubsets(String str, String ans, int i){
        //base case 
        if(i==str.length()){
            System.out.println(ans);
            return;
            }

        //yes choice

        findsubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findsubsets(str, ans, i+1);
        }
    
    public static void main(String[] args) {
        String str = "abcde";
        findsubsets(str, "", 0);
    }

    
    }
    

