package recursion;

public class AllIndicesOfNumber {
    public static void allIndicesOfNumber(int []input,int n,int startIndex){
        if(input.length==startIndex){
            return;
        }
        if(input[startIndex]==n){
            System.out.print(startIndex+" ");
        }
        allIndicesOfNumber(input, n, startIndex+1);
    }
    public static void allIndicesOfNumber(int []input,int n){
        allIndicesOfNumber(input,n,0);
    }
    public static void main(String[]args){
        int input[]={9,8,10,8,8};
        allIndicesOfNumber(input,8);
    }
}
