package recursion;
public class SumOfArray {
    public static int sumOfArray(int []input){
        return sumOfArray(input,0);
    }
    public static int sumOfArray(int []input,int startIndex) {
        if (input.length == startIndex) {
            return 0;
        }
        return input[startIndex]+sumOfArray(input,startIndex+1);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        System.out.println(sumOfArray(arr));
    }
}
