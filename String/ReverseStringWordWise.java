package String;
public class ReverseStringWordWise {
    public static String reverseStringWordWise(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reverse = "";
                for (int j = currentWordStart; j < currentWordEnd; j++) {
                    reverse = str.charAt(j) + reverse;
                }
                ans = ans + reverse + " ";
                currentWordEnd = i + 1;
            }
            int currentWordEnd = i - 1;
            String reverseWord = "";
            for (int j = currentWordStart; j < currentWordEnd; j++) {
                reverseWord = str.charAt(j) + reverseWord;
            }
            ans = ans + reverseWord+" ";

        }
        return ans;
    }
    public static void main(String[]args){
        String str="ab cd ef";
        System.out.println(reverseStringWordWise(str));
    }

}
