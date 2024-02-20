package recursion;
public class CheckNumberInArray {
    public static boolean checkNumberInArray(int input[],int n,int startIndex){
        if(input.length==startIndex)
            return false;
        if(input[startIndex]==n)
            return true;
        return checkNumberInArray(input,n,startIndex+1);
    }
    public static boolean checkNumberInArray(int input[],int n){
        return checkNumberInArray(input,n,0);
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(checkNumberInArray(arr,9));
    }
}
