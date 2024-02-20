package String.Assignment;
public class HighestOccuringChar {
    public static char highestOccuringChar(String str){
        int n=str.length();
        int frequency[]=new int[256];
        int maxfrequency=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            frequency[ch]++;
            maxfrequency=Math.max(frequency[str.charAt(i)],maxfrequency);
        }
        char ans='\0';
        for(int i=0;i<n;i++) {
            if (frequency[str.charAt(i)] == maxfrequency) {
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }
    public static void main(String []args){
        System.out.println(highestOccuringChar("aabbbbba"));
    }
}

