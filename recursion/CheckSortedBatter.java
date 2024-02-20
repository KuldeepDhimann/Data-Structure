package recursion;

import java.io.LineNumberReader;

public class CheckSortedBatter {
    public static boolean checkSorted2(int []input){
        return checkSortedBetter(input,0);
    }
    public static boolean checkSortedBetter(int []input,int startIndex){
        if(startIndex>=input.length)
            return true;
        if(input[startIndex]<input[startIndex+1])
            return true;
        boolean smallAns=checkSortedBetter(input,startIndex+1);
        return smallAns;
    }
    public static void main(String []args){
        int []arr={1,2,3};
        System.out.println(checkSorted2(arr));
    }
}
