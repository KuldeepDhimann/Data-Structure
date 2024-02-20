package recursion;

public class LastIndexNo {
    public static int lastIndexNumber(int input[], int n, int startIndex) {
        if (input.length == startIndex) {
            return -1;
        }
        if (input[startIndex] == n) {
            return startIndex;
        }
        return lastIndexNumber(input, n, startIndex -1);

    }
    public static int lastIndexNumber(int []input,int n){

        return lastIndexNumber(input,n,input.length-1);
    }
    public static void main(String []args){
        int []arr={9,8,10,8};
        System.out.println(lastIndexNumber(arr,8));
    }
}
